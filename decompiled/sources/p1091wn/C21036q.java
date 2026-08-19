package p1091wn;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.C0716A;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: wn.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C21036q implements InterfaceC21029j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21029j f66917a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1436k f66918b;

    public C21036q(InterfaceC21029j sequence, InterfaceC1436k transformer) {
        AbstractC16544l.m18094g(sequence, "sequence");
        AbstractC16544l.m18094g(transformer, "transformer");
        this.f66917a = sequence;
        this.f66918b = transformer;
    }

    @Override // p1091wn.InterfaceC21029j
    public final Iterator iterator() {
        return new C0716A(this);
    }
}
