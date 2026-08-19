package p533Vl;

import java.io.Closeable;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Vl.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C8389a implements Closeable, InterfaceC0571F {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC18776i f26107Y;

    public C8389a(InterfaceC18776i context) {
        AbstractC16544l.m18094g(context, "context");
        this.f26107Y = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC0575H.m1181j(this.f26107Y, null);
    }

    @Override // p025An.InterfaceC0571F
    public final InterfaceC18776i getCoroutineContext() {
        return this.f26107Y;
    }
}
