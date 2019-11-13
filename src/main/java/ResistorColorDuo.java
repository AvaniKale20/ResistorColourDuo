class ResistorColorDuo {
    private enum Colors {
        black, brown, red, orange, yellow, green, blue, violet, grey, white;
    }

    int value(String[] colors) {
        String color = "";
        for (int i = 0; i < colors.length; i++) {
            color += Colors.valueOf(colors[i]).ordinal();
        }
        return Integer.valueOf(color);
    }
}
