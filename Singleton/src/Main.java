public class Main {
    public static void main(String[] args) {
        /**
         * Eager
         */
        SingletonEager singletonEager1 = SingletonEager.getEagerInstance();
        SingletonEager singletonEager2 = SingletonEager.getEagerInstance();

        //prove singleton
        System.out.println(singletonEager1);
        System.out.println(singletonEager2);

        /**
         * Eager static block
         */
        SingletonStaticBlock singletonStaticBlock1 = SingletonStaticBlock.getInstance();
        SingletonStaticBlock singletonStaticBlock2 = SingletonStaticBlock.getInstance();

        //prove singleton for static block
        System.out.println(singletonStaticBlock1);
        System.out.println(singletonStaticBlock2);

        /**
         * Lazy
         */
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();

        //prove singleton for lazy instance
        System.out.println(singletonLazy1);
        System.out.println(singletonLazy2);

        /**
         * Thread
         */
        SingletonThreadSafe singletonThreadSafe1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe singletonThreadSafe2 = SingletonThreadSafe.getInstance();

        //prove singleton for thread safe
        System.out.println(singletonThreadSafe1);
        System.out.println(singletonThreadSafe2);

        /**
         * Bill Pugh
         */
        SingletonBillPugh singletonBillPugh1 = SingletonBillPugh.getInstance();
        SingletonBillPugh singletonBillPugh2 = SingletonBillPugh.getInstance();

        //prove singleton for bill pugh
        System.out.println(singletonBillPugh1);
        System.out.println(singletonBillPugh2);
    }
}