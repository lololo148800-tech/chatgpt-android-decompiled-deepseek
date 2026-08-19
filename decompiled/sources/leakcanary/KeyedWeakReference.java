package leakcanary;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import fo.C13709f;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18066d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013¨\u0006\u001d"}, m18067d2 = {"Lleakcanary/KeyedWeakReference;", "Ljava/lang/ref/WeakReference;", "", "referent", "", SubscriberAttributeKt.JSON_NAME_KEY, "description", "", "watchUptimeMillis", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;JLjava/lang/ref/ReferenceQueue;)V", "Lmm/C;", SDPKeywords.CLEAR, "()V", "retainedUptimeMillis", "J", "getRetainedUptimeMillis", "()J", "setRetainedUptimeMillis", "(J)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "getDescription", "getWatchUptimeMillis", "Companion", "fo/f", "leakcanary-object-watcher"}, m18068k = 1, m18069mv = {1, 4, 1})
public final class KeyedWeakReference extends WeakReference<Object> {
    public static final C13709f Companion = new C13709f();
    private static volatile long heapDumpUptimeMillis;
    private final String description;
    private final String key;
    private volatile long retainedUptimeMillis;
    private final long watchUptimeMillis;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyedWeakReference(Object referent, String key, String description, long j10, ReferenceQueue<Object> referenceQueue) {
        super(referent, referenceQueue);
        AbstractC16544l.m18095h(referent, "referent");
        AbstractC16544l.m18095h(key, "key");
        AbstractC16544l.m18095h(description, "description");
        AbstractC16544l.m18095h(referenceQueue, "referenceQueue");
        this.key = key;
        this.description = description;
        this.watchUptimeMillis = j10;
        this.retainedUptimeMillis = -1L;
    }

    public static final long getHeapDumpUptimeMillis() {
        return heapDumpUptimeMillis;
    }

    public static final void setHeapDumpUptimeMillis(long j10) {
        heapDumpUptimeMillis = j10;
    }

    @Override // java.lang.ref.Reference
    public void clear() {
        super.clear();
        this.retainedUptimeMillis = -1L;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getKey() {
        return this.key;
    }

    public final long getRetainedUptimeMillis() {
        return this.retainedUptimeMillis;
    }

    public final long getWatchUptimeMillis() {
        return this.watchUptimeMillis;
    }

    public final void setRetainedUptimeMillis(long j10) {
        this.retainedUptimeMillis = j10;
    }
}
