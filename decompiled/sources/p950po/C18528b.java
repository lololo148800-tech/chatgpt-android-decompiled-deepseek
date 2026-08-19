package p950po;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import p178H.C3179x;
import p298Lm.C5150L;
import p974qo.C18795k;
import to.C20022m;

/* JADX INFO: renamed from: po.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C18528b extends AbstractC18527a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f59031e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f59032f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18528b(String str, int i10, Object obj) {
        super(str, true);
        this.f59031e = i10;
        this.f59032f = obj;
    }

    @Override // p950po.AbstractC18527a
    /* JADX INFO: renamed from: a */
    public final long mo19887a() {
        switch (this.f59031e) {
            case 0:
                ((C5150L) this.f59032f).invoke();
                return -1L;
            case 1:
                C3179x c3179x = (C3179x) this.f59032f;
                long jNanoTime = System.nanoTime();
                int i10 = 0;
                long j10 = Long.MIN_VALUE;
                C18795k c18795k = null;
                int i11 = 0;
                for (C18795k connection : (ConcurrentLinkedQueue) c3179x.f9589p0) {
                    AbstractC16544l.m18093f(connection, "connection");
                    synchronized (connection) {
                        if (c3179x.m4025c(connection, jNanoTime) > 0) {
                            i11++;
                        } else {
                            i10++;
                            long j11 = jNanoTime - connection.f59754q;
                            if (j11 > j10) {
                                c18795k = connection;
                                j10 = j11;
                            }
                        }
                    }
                }
                long j12 = c3179x.f9586Y;
                if (j10 < j12 && i10 <= 5) {
                    if (i10 > 0) {
                        return j12 - j10;
                    }
                    if (i11 > 0) {
                        return j12;
                    }
                    return -1L;
                }
                AbstractC16544l.m18091d(c18795k);
                synchronized (c18795k) {
                    if (!c18795k.f59753p.isEmpty()) {
                        return 0L;
                    }
                    if (c18795k.f59754q + j10 != jNanoTime) {
                        return 0L;
                    }
                    c18795k.f59747j = true;
                    ((ConcurrentLinkedQueue) c3179x.f9589p0).remove(c18795k);
                    Socket socket = c18795k.f59741d;
                    AbstractC16544l.m18091d(socket);
                    AbstractC17708b.m19413e(socket);
                    if (!((ConcurrentLinkedQueue) c3179x.f9589p0).isEmpty()) {
                        return 0L;
                    }
                    ((C18529c) c3179x.f9587Z).m19888a();
                    return 0L;
                }
            default:
                C20022m c20022m = (C20022m) this.f59032f;
                c20022m.getClass();
                try {
                    c20022m.f63382I0.m20847P(2, 0, false);
                    return -1L;
                } catch (IOException e10) {
                    c20022m.m20820a(2, 2, e10);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18528b(C3179x c3179x, String str) {
        super(str, true);
        this.f59031e = 1;
        this.f59032f = c3179x;
    }
}
