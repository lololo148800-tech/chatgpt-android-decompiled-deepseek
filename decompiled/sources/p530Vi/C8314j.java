package p530Vi;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Vi.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C8314j extends AbstractC8315k {

    /* JADX INFO: renamed from: Y */
    public final C8313i f25910Y;

    public C8314j(C8313i c8313i) {
        this.f25910Y = c8313i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8314j) {
            return AbstractC16544l.m18089b(this.f25910Y, ((C8314j) obj).f25910Y);
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f25910Y;
    }

    public final int hashCode() {
        return this.f25910Y.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "SettingsFail(cause=" + this.f25910Y + ')';
    }
}
