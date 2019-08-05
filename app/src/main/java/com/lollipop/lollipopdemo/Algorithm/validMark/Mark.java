package com.lollipop.lollipopdemo.Algorithm.validMark;

class Mark {
    public String key;
    public String value;
    public String[] leftMarks = new String[]{"[", "{", "("};

    Mark(String key) {
        switch (key) {
            case "(":
                value = ")";
                break;
            case ")":
                value = "(";
                break;
            case "[":
                value = "]";
                break;
            case "]":
                value = "[";
                break;
            case "{":
                value = "}";
                break;
            case "}":
                value = "{";
                break;
            default:
                value = "";
                break;
        }
        this.key = key;
    }

    public boolean isLeftMark() {
        for (int i = 0; i < leftMarks.length; i++) {
            if (key.equals(leftMarks[i]))
                return true;
        }
        return false;
    }
}
