package labs_examples.objects_classes_methods.labs.methods;

class MethodTraining {
    public static void main(String[] args) {
        int membershipSizeToday = 500;
        MethodTraining example = new MethodTraining();
        ClubMembership myMembership = new ClubMembership("VVIP", "Gold", membershipSizeToday);
        System.out.println("1) Demonstrating method overloading");
        myMembership.printAttributes(myMembership.getName());
        myMembership.printAttributes(myMembership.getName(), myMembership.getStatus());
        myMembership.printAttributes(myMembership.getName(), myMembership.getStatus(), myMembership.getMembershipSize());
        System.out.println();

        System.out.println("2) Part 1: Demonstrating passing by reference");
        System.out.println("My club's membership size is: " + myMembership.getMembershipSize());
        myMembership.changeMembershipSize(myMembership);
        System.out.println("After applying the changeMembershipSize method, my club's membership size is now: " + myMembership.getMembershipSize());
        System.out.println();

        System.out.println("2) Part 2: Demonstrating passing by value");
        System.out.println("Even after changing the object, the value of int membershipSizeToday itself is still unchanged: " + membershipSizeToday);
        System.out.println();

        System.out.println("3) Maximum of four numbers");
        Numbers exampleOfFour = new Numbers(77, 22, 999, 4);
        System.out.println(exampleOfFour.maxOfFour());

    }
}

    class ClubMembership {
        private String name;
        private String status;
        private int membershipSize;

        public ClubMembership(String name, String status, int membershipSize) {
            this.name = name;
            this.status = status;
            this.membershipSize = membershipSize;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getMembershipSize() {
            return membershipSize;
        }

        public void setMembershipSize(int membershipSize) {
            this.membershipSize = membershipSize;
        }

        public void printAttributes(String name) {
            System.out.println("Welcome to " + name);
        }

        public void printAttributes(String name, String status) {
            System.out.println("Welcome to " + name + ". You have " + status + " status");
        }

        public void printAttributes(String name, String status, int membershipSize) {
            System.out.println("Welcome to " + name + ". You have " + status + " status and are one of " + membershipSize + " members");
        }

        public void changeMembershipSize(ClubMembership clubExample) {
            clubExample.setMembershipSize(clubExample.getMembershipSize() + 1);
    }
}

class Numbers {
        int numOne;
        int numTwo;
        int numThree;
        int numFour;

    public Numbers(int numOne, int numTwo, int numThree, int numFour) {
        this.numOne = numOne;
        this.numTwo = numTwo;
        this.numThree = numThree;
        this.numFour = numFour;
    }

    public int maxOfFour() {
        int [] arrayNum = new int[4];
        arrayNum[0] = this.numOne;
        arrayNum[1] = this.numTwo;
        arrayNum[2] = this.numThree;
        arrayNum[3] = this.numFour;
        int maxNum = arrayNum[0];
        for (int i = 1; i < arrayNum.length; i++) {
            if (arrayNum[i] > maxNum)
                maxNum = arrayNum[i];
        }
        return maxNum;
    }
}
