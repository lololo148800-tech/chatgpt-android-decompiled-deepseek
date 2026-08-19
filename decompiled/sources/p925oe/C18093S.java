package p925oe;

import kotlin.jvm.internal.AbstractC16546n;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: oe.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C18093S {

    /* JADX INFO: renamed from: a */
    public final String f57724a;

    /* JADX INFO: renamed from: b */
    public final AbstractC16546n f57725b;

    /* JADX INFO: renamed from: c */
    public final String f57726c;

    /* JADX INFO: renamed from: d */
    public final String f57727d;

    /* JADX INFO: renamed from: e */
    public final AbstractC16546n f57728e;

    /* JADX WARN: Multi-variable type inference failed */
    public C18093S(String str, String str2, String str3, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
        this.f57724a = str;
        this.f57725b = (AbstractC16546n) interfaceC1436k;
        this.f57726c = str2;
        this.f57727d = str3;
        this.f57728e = (AbstractC16546n) interfaceC1436k2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18093S)) {
            return false;
        }
        C18093S c18093s = (C18093S) obj;
        return this.f57724a.equals(c18093s.f57724a) && this.f57725b.equals(c18093s.f57725b) && this.f57726c.equals(c18093s.f57726c) && this.f57727d.equals(c18093s.f57727d) && this.f57728e.equals(c18093s.f57728e);
    }

    public final int hashCode() {
        return this.f57728e.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p((this.f57725b.hashCode() + (this.f57724a.hashCode() * 31)) * 31, 31, this.f57726c), 31, this.f57727d);
    }

    public final String toString() {
        return "█";
    }
}
