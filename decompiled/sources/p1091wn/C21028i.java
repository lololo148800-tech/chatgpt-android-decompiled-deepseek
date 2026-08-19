package p1091wn;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: wn.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C21028i implements InterfaceC21029j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21029j f66905a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1436k f66906b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1436k f66907c;

    public C21028i(InterfaceC21029j sequence, InterfaceC1436k transformer, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(sequence, "sequence");
        AbstractC16544l.m18094g(transformer, "transformer");
        this.f66905a = sequence;
        this.f66906b = transformer;
        this.f66907c = interfaceC1436k;
    }

    @Override // p1091wn.InterfaceC21029j
    public final Iterator iterator() {
        return new C21025f(this);
    }
}
