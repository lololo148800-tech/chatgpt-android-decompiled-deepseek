package p1113xn;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1439n;
import p1091wn.InterfaceC21029j;

/* JADX INFO: renamed from: xn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C21309c implements InterfaceC21029j {

    /* JADX INFO: renamed from: a */
    public final CharSequence f67730a;

    /* JADX INFO: renamed from: b */
    public final int f67731b;

    /* JADX INFO: renamed from: c */
    public final int f67732c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1439n f67733d;

    public C21309c(CharSequence input, int i10, int i11, InterfaceC1439n interfaceC1439n) {
        AbstractC16544l.m18094g(input, "input");
        this.f67730a = input;
        this.f67731b = i10;
        this.f67732c = i11;
        this.f67733d = interfaceC1439n;
    }

    @Override // p1091wn.InterfaceC21029j
    public final Iterator iterator() {
        return new C21308b(this);
    }
}
