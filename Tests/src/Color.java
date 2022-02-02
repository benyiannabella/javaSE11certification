public enum Color {

    RED(1, 2) {
        void toSpectrum() {
        }
    },
    BLUE(2) {
        void toSpectrum() {
        }

        void printColor() {
        }
    },
    ORANGE() {
        void toSpectrum() {
        }
    },
    GREEN(4) {
        @Override
        void toSpectrum() {

        }
    };

    Color(int... color) {
    }

    abstract void toSpectrum();

    void printColor() {
    }
}
