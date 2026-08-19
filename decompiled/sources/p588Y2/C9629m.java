package p588Y2;

import java.util.concurrent.atomic.AtomicReference;
import p841k.AbstractC16283c;
import p859l.AbstractC16651b;

/* JADX INFO: renamed from: Y2.m */
/* JADX INFO: loaded from: classes.dex */
public final class C9629m extends AbstractC16283c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f29026a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC16651b f29027b;

    public C9629m(AtomicReference atomicReference, AbstractC16651b abstractC16651b) {
        this.f29026a = atomicReference;
        this.f29027b = abstractC16651b;
    }

    @Override // p841k.AbstractC16283c
    /* JADX INFO: renamed from: a */
    public final AbstractC16651b mo10187a() {
        return this.f29027b;
    }

    @Override // p841k.AbstractC16283c
    /* JADX INFO: renamed from: b */
    public final void mo10188b(Object obj) {
        AbstractC16283c abstractC16283c = (AbstractC16283c) this.f29026a.get();
        if (abstractC16283c == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        abstractC16283c.mo10188b(obj);
    }
}
