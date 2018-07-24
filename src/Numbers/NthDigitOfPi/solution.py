from math import atan

PIAPX = 16 * atan(1.0 / 5.0) - 4 * atan(1.0 / 239.0)


def getNDigitPi(n=100):
    return round(PIAPX, 100 if n > 100 else n)


if __name__ == "__main__":
    n = int(input())
    print(getNDigitPi(n))
