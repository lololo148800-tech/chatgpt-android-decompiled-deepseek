package p308M6;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p037B9.MeDP.MpoABj;
import p582Xk.HXHG.TfazcFv;
import p775h2.AbstractC14376f;
import sj.hJY.CsqksqyPE;

/* JADX INFO: renamed from: M6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5299a {

    /* JADX INFO: renamed from: a */
    public final int f17464a;

    /* JADX INFO: renamed from: b */
    public int f17465b;

    /* JADX INFO: renamed from: c */
    public Object f17466c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5299a)) {
            return false;
        }
        C5299a c5299a = (C5299a) obj;
        return this.f17464a == c5299a.f17464a && this.f17465b == c5299a.f17465b && AbstractC16544l.m18089b(this.f17466c, c5299a.f17466c);
    }

    public final int hashCode() {
        int iM24h = ((AbstractC0010F.m24h(this.f17464a) * 31) + this.f17465b) * 31;
        Object obj = this.f17466c;
        return iM24h + (obj == null ? 0 : obj.hashCode());
    }

    public C5299a(int i10, Object obj) {
        AbstractC14376f.m15825D(i10, MpoABj.egkeqegTA);
        this.f17464a = i10;
        this.f17465b = -1;
        this.f17466c = obj;
    }

    public final String toString() {
        String str;
        int i10 = this.f17465b;
        Object obj = this.f17466c;
        StringBuilder sb2 = new StringBuilder("Param(valeType=");
        switch (this.f17464a) {
            case 1:
                str = "FLOAT";
                break;
            case 2:
                str = CsqksqyPE.AaTjct;
                break;
            case 3:
                str = "BOOL";
                break;
            case 4:
                str = "FLOAT_VEC2";
                break;
            case 5:
                str = "FLOAT_VEC3";
                break;
            case 6:
                str = "FLOAT_VEC4";
                break;
            case 7:
                str = "INT_VEC2";
                break;
            case 8:
                str = "INT_VEC3";
                break;
            case 9:
                str = "INT_VEC4";
                break;
            case 10:
                str = "MAT3";
                break;
            case 11:
                str = "MAT4";
                break;
            case 12:
                str = "MAT3x4";
                break;
            case 13:
                str = "SAMPLER_2D";
                break;
            case 14:
                str = "SAMPLER_OES";
                break;
            default:
                str = TfazcFv.LgY;
                break;
        }
        sb2.append(str);
        sb2.append(", location=");
        sb2.append(i10);
        sb2.append(", value=");
        sb2.append(obj);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
