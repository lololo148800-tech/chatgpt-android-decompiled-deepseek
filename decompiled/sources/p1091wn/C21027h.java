package p1091wn;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: wn.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C21027h implements InterfaceC21029j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21029j f66902a;

    /* JADX INFO: renamed from: b */
    public final boolean f66903b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1436k f66904c;

    public C21027h(InterfaceC21029j interfaceC21029j, boolean z6, InterfaceC1436k predicate) {
        AbstractC16544l.m18094g(predicate, "predicate");
        this.f66902a = interfaceC21029j;
        this.f66903b = z6;
        this.f66904c = predicate;
    }

    @Override // p1091wn.InterfaceC21029j
    public final Iterator iterator() {
        return new C21025f(this);
    }
}
