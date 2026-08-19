package p530Vi;

import java.net.URL;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Vi.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C8313i extends AbstractC8315k {

    /* JADX INFO: renamed from: Y */
    public final URL f25908Y;

    /* JADX INFO: renamed from: Z */
    public final Exception f25909Z;

    public C8313i(URL url, Exception exc) {
        this.f25908Y = url;
        this.f25909Z = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8313i)) {
            return false;
        }
        C8313i c8313i = (C8313i) obj;
        return AbstractC16544l.m18089b(this.f25908Y, c8313i.f25908Y) && AbstractC16544l.m18089b(this.f25909Z, c8313i.f25909Z);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f25909Z;
    }

    public final int hashCode() {
        URL url = this.f25908Y;
        int iHashCode = (url == null ? 0 : url.hashCode()) * 31;
        Exception exc = this.f25909Z;
        return iHashCode + (exc != null ? exc.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "NetworkUnknown(uri=" + this.f25908Y + ", cause=" + this.f25909Z + ')';
    }
}
