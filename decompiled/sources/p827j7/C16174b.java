package p827j7;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p544W9.AbstractC8531O3;

/* JADX INFO: renamed from: j7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C16174b extends AbstractC8531O3 {

    /* JADX INFO: renamed from: a */
    public final Throwable f50209a;

    /* JADX INFO: renamed from: b */
    public final String f50210b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f50211c;

    public C16174b(String message, Throwable throwable, ArrayList arrayList) {
        AbstractC16544l.m18094g(throwable, "throwable");
        AbstractC16544l.m18094g(message, "message");
        this.f50209a = throwable;
        this.f50210b = message;
        this.f50211c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16174b)) {
            return false;
        }
        C16174b c16174b = (C16174b) obj;
        return AbstractC16544l.m18089b(this.f50209a, c16174b.f50209a) && AbstractC16544l.m18089b(this.f50210b, c16174b.f50210b) && this.f50211c.equals(c16174b.f50211c);
    }

    public final int hashCode() {
        return this.f50211c.hashCode() + AbstractC0168G.m527p(this.f50209a.hashCode() * 31, 31, this.f50210b);
    }

    public final String toString() {
        return "Rum(throwable=" + this.f50209a + ", message=" + this.f50210b + ", threads=" + this.f50211c + Separators.RPAREN;
    }
}
