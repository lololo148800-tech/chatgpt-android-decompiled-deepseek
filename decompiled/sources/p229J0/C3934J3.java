package p229J0;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0624m;

/* JADX INFO: renamed from: J0.J3 */
/* JADX INFO: loaded from: classes.dex */
public final class C3934J3 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4006X3 f12112a;

    /* JADX INFO: renamed from: b */
    public final C0624m f12113b;

    public C3934J3(InterfaceC4006X3 interfaceC4006X3, C0624m c0624m) {
        this.f12112a = interfaceC4006X3;
        this.f12113b = c0624m;
    }

    /* JADX INFO: renamed from: a */
    public final void m4634a() {
        C0624m c0624m = this.f12113b;
        if (c0624m.m1266w()) {
            c0624m.resumeWith(EnumC4001W3.f12552Y);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3934J3.class != obj.getClass()) {
            return false;
        }
        C3934J3 c3934j3 = (C3934J3) obj;
        return AbstractC16544l.m18089b(this.f12112a, c3934j3.f12112a) && this.f12113b.equals(c3934j3.f12113b);
    }

    public final int hashCode() {
        return this.f12113b.hashCode() + (this.f12112a.hashCode() * 31);
    }
}
