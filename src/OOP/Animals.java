package OOP;


    public class Animals {
        protected String name;
        protected String type;
        protected int maxRun;
        protected int maxSwim;
        protected double maxJump;
        private static int count;

        public Animals(String name){
            this.name = name;
        }
        public static int getCount(){
            count = Dog.getCount() + Cat.getCount();
            return count;
        }

        public void run(int dist) {
            if (this.maxRun >= dist) {
                System.out.println(this.type + " " + this.name + " пробежал(а): " + dist + " м");
            } else {
                System.out.println(this.type + " " + this.name + " не может пробежать так далеко");
            }
        }

        public void swim(int dist) {
            if (this.maxSwim >= dist) {
                System.out.println(this.type + " " + this.name + " проплыл(а): " + dist + " м");
            } else {
                System.out.println(this.type + " " + this.name + " не может плавать так далеко");
            }
        }

        public void jump(double height) {
            if (this.maxJump >= height) {
                System.out.println(this.type + " " + this.name + " прыгнул(а) на " + height + " м");
            } else {
                System.out.println(this.type + " " + this.name + " не может прыгнуть так высоко");
            }
        }
    }

