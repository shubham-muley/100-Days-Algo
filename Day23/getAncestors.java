public List<Integer> getAncestors(int value) {
        List<Integer> list = new ArrayList<Integer>();
        getAncestors(root, value, list);
        return list;
    }

private boolean getAncestors(Node root, int value, List<Integer> list) {

        if (root == null)
            return false;

        if (root.value == value)
            return true;

        if (getAncestors(root.LeftChild, value, list) ||
                getAncestors(root.RightChild, value, list)) {
            list.add(root.value);
            return true;
        }

        return false;
    }
