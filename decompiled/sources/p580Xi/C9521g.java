package p580Xi;

import com.segment.analytics.kotlin.core.AbstractC12774a;
import com.segment.analytics.kotlin.core.Settings;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.C0611f0;
import p1114xp.InterfaceC21347r;
import p117Eb.C2392v;
import p153Fn.C2925c;
import p530Vi.C8312h;
import p554Wi.EnumC8881h;
import p554Wi.InterfaceC8882i;
import p594Y9.AbstractC9758K4;
import p594Y9.AbstractC9804S3;

/* JADX INFO: renamed from: Xi.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C9521g implements InterfaceC8882i, InterfaceC21347r {

    /* JADX INFO: renamed from: Y */
    public C8312h f28655Y;

    /* JADX INFO: renamed from: Z */
    public final AtomicBoolean f28656Z = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o0 */
    public final ConcurrentLinkedQueue f28657o0 = new ConcurrentLinkedQueue();

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: a */
    public final AbstractC12774a mo7802a(AbstractC12774a abstractC12774a) {
        if (this.f28656Z.get()) {
            return abstractC12774a;
        }
        AbstractC9758K4.m10361b(mo7804c(), "SegmentStartupQueue queueing event");
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f28657o0;
        if (concurrentLinkedQueue.size() >= 1000) {
            concurrentLinkedQueue.remove();
        }
        concurrentLinkedQueue.offer(abstractC12774a);
        return null;
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: b */
    public final void mo7803b(Settings settings, int i10) {
        AbstractC9804S3.m10428b(settings, i10);
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: c */
    public final C8312h mo7804c() {
        C8312h c8312h = this.f28655Y;
        if (c8312h != null) {
            return c8312h;
        }
        AbstractC16544l.m18103p("analytics");
        throw null;
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: d */
    public final void mo7805d(C8312h c8312h) {
        this.f28655Y = c8312h;
        C2392v c2392v = c8312h.f25903Z;
        AbstractC0575H.m1156D((C2925c) c2392v.f7437o0, (C0611f0) c2392v.f7438p0, null, new C9520f(c8312h, this, null), 2);
    }

    @Override // p554Wi.InterfaceC8882i
    public final EnumC8881h getType() {
        return EnumC8881h.f27183Y;
    }
}
