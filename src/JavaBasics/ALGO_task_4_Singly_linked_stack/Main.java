package JavaBasics.ALGO_task_4_Singly_linked_stack;

public class Main {
    static class Node {
        String value;
        Node prev;

        Node(String v) {
            value = v;
            prev = null;
        }

        Node(String v, Node n) {
            value = v;
            prev = n;
        }
    }

    static class Stack {
        public static Node head;

        public Stack() {
            head = null;
        }

        public void push(String value) {
            if (head == null) {
                head = new Node(value);
            } else {
                Node node = new Node(value, head);
                head = node;
            }
        }

        public String pop() {
            if (head == null) {
                return "Нет элементов";
            } else {
                String value = head.value;
                head = head.prev;
                return value;
            }
        }

        public void printMe() {
            if (head == null) {
                System.out.println("EMPTY");
            } else {
                Node node = head;
                while (node != null) {
                    System.out.print(node.value);
                    if (node.prev != null) {
                        System.out.print(" -> ");
                    }
                    node = node.prev;
                }
                System.out.println();
            }
        }

        public Stack reverse() {
            if (head == null) {
                System.out.println("EMPTY");
                return this;
            } else {
                Node node = head;
                Stack stackNew = new Stack();
                while (node != null) {
                    stackNew.push(node.value);
                    node = node.prev;
                }
                return stackNew;
            }
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        testAddElement(stack, "0", "1", "2", "3", "4", "5");

        testDeleteElement(stack);
        testDeleteElement(stack);

        testReversElements(stack);

        testDeleteElement(stack);
        testDeleteElement(stack);

        testReversElements(stack);

        testDeleteElement(stack);
        testDeleteElement(stack);
    }

    public static void testAddElement(Stack stack, String... str) {
        stack.printMe();
        for (String s : str) {
            System.out.println("Добавим " + s);
            stack.push(s);
            stack.printMe();
        }
    }

    public static void testDeleteElement(Stack stack) {
        System.out.println("Снимем со стека");
        System.out.println(stack.pop());
        stack.printMe();
    }

    public static void testReversElements(Stack stack) {
        System.out.println("Ревёрс!");
        stack.reverse();
        stack.printMe();
    }
}
