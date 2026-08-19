package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.NamingThreadFactory;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class MultiPipelineExecutor<K> {
    private ExecutorService executor;
    private ConcurrentHashMap<K, SemaphoreLinkedList<SemaphoreRunnable<K>>> map = new ConcurrentHashMap<>();

    public static class SemaphoreLinkedList<A> extends LinkedList<A> {
        private static final long serialVersionUID = 1;
        Semaphore semaphore = new Semaphore(1);
    }

    public static class SemaphoreRunnable<K> implements Runnable {
        protected MultiPipelineExecutor<K> parent;
        protected Semaphore semaphore;
        protected Runnable wrappedTask;

        public SemaphoreRunnable(Runnable runnable, Semaphore semaphore, MultiPipelineExecutor<K> multiPipelineExecutor) {
            this.wrappedTask = runnable;
            this.semaphore = semaphore;
            this.parent = multiPipelineExecutor;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.wrappedTask.run();
            } finally {
                this.semaphore.release();
                this.parent.notifyAll();
            }
        }
    }

    public MultiPipelineExecutor(int i10) {
        this.executor = Executors.newFixedThreadPool(i10, new NamingThreadFactory("jain_sip_multi_pipeline_executor"));
    }

    public synchronized void addTask(K k8, Runnable runnable) {
        try {
            SemaphoreLinkedList<SemaphoreRunnable<K>> semaphoreLinkedList = this.map.get(k8);
            if (semaphoreLinkedList == null) {
                semaphoreLinkedList = new SemaphoreLinkedList<>();
                this.map.put(k8, semaphoreLinkedList);
            }
            semaphoreLinkedList.addFirst(new SemaphoreRunnable(runnable, semaphoreLinkedList.semaphore, this));
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void processTasks() {
        try {
            wait();
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        Enumeration<K> enumerationKeys = this.map.keys();
        while (enumerationKeys.hasMoreElements()) {
            SemaphoreLinkedList<SemaphoreRunnable<K>> semaphoreLinkedList = this.map.get(enumerationKeys.nextElement());
            if (!semaphoreLinkedList.isEmpty() && semaphoreLinkedList.semaphore.tryAcquire()) {
                this.executor.execute(semaphoreLinkedList.pollLast());
            }
        }
    }

    public void remove(K k8) {
        this.map.remove(k8);
    }
}
