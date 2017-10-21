from trivia import Game
from pytest import fixture


@fixture
def game():
    g = Game()
    g.add('a')
    g.add('b')
    return g


def test_how_many_players(game):
    assert game.how_many_players == 2


def test_wrong_answer_returns_true(game):
    assert game.wrong_answer()


def test_correct_answers_eventually_wins(game):
    for i in range(5):
        for p in ['a', 'b']:
            game.roll(1)
            assert game.was_correctly_answered()
    game.roll(1)
    assert not game.was_correctly_answered()


def test_wrong_answer_does_not_win(game):
    for i in range(5):
        for p in ['a', 'b']:
            game.roll(2)
            assert game.was_correctly_answered()
    # both at place 10
    game.roll(1)
    assert game.wrong_answer()
    game.roll(1)
    assert game.wrong_answer()
    game.roll(4)
    assert game.was_correctly_answered()
    game.roll(3)
    assert not game.was_correctly_answered()


def test_two_sixes_does_not_crash(game):
    for i in range(4):
        game.roll(6)
        game.was_correctly_answered()


def test_is_playable():
    g = Game()
    assert not g.is_playable()
    g.add('one')
    assert not g.is_playable()
    g.add('two')
    assert g.is_playable()


if __name__ == 'main':
    test_how_many_players()
