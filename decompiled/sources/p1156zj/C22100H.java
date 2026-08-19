package p1156zj;

import android.content.Context;
import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p037B9.MeDP.MpoABj;
import p086D6.C1970n;
import p103Dn.InterfaceC2184i;
import p149Fj.C2879m;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9393x3;
import p729ej.InterfaceC13427r;
import p909nm.C17689w;
import p949pj.AbstractC18481o;
import p949pj.C18434G;
import p949pj.C18438K;
import p949pj.C18447U;
import p949pj.C18453a;
import p949pj.C18477m;
import p949pj.C18479n;

/* JADX INFO: renamed from: zj.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C22100H implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final Context f69857b;

    /* JADX INFO: renamed from: c */
    public final C18438K f69858c;

    /* JADX INFO: renamed from: d */
    public final EnumC22128V0 f69859d;

    /* JADX INFO: renamed from: e */
    public final String f69860e;

    /* JADX INFO: renamed from: f */
    public C2879m f69861f;

    public C22100H(Context context, C18438K governmentIdFeed, EnumC22128V0 side, String idClassKey) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(governmentIdFeed, "governmentIdFeed");
        AbstractC16544l.m18094g(side, "side");
        AbstractC16544l.m18094g(idClassKey, "idClassKey");
        this.f69857b = context;
        this.f69858c = governmentIdFeed;
        this.f69859d = side;
        this.f69860e = idClassKey;
        this.f69861f = new C2879m(C17689w.f56480Y);
    }

    /* JADX INFO: renamed from: c */
    public static C22106K m22353c(C18447U c18447u) {
        C22106K c22106k;
        AbstractC18481o abstractC18481o = c18447u.f58864d;
        if (abstractC18481o == null) {
            C18434G c18434g = c18447u.f58865e;
            if (c18434g != null) {
                return new C22106K(c18434g.f58804Y, c18434g.f58805Z);
            }
            return null;
        }
        if (abstractC18481o instanceof C18477m) {
            C18477m c18477m = (C18477m) abstractC18481o;
            c22106k = new C22106K(c18477m.f58920c, c18477m.f58921d);
        } else {
            if (!(abstractC18481o instanceof C18479n)) {
                throw new C0644w();
            }
            C18479n c18479n = (C18479n) abstractC18481o;
            C18453a c18453aM19879b = c18479n.m19879b();
            Date date = c18453aM19879b != null ? c18453aM19879b.f58895m : null;
            C18453a c18453aM19879b2 = c18479n.m19879b();
            c22106k = new C22106K(date, c18453aM19879b2 != null ? c18453aM19879b2.f58894l : null);
        }
        return c22106k;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        return (otherWorker instanceof C22100H) && ((C22100H) otherWorker).f69859d == this.f69859d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22100H)) {
            return false;
        }
        C22100H c22100h = (C22100H) obj;
        return AbstractC16544l.m18089b(this.f69857b, c22100h.f69857b) && AbstractC16544l.m18089b(this.f69858c, c22100h.f69858c) && this.f69859d == c22100h.f69859d && AbstractC16544l.m18089b(this.f69860e, c22100h.f69860e);
    }

    public final int hashCode() {
        return this.f69860e.hashCode() + ((this.f69859d.hashCode() + ((this.f69858c.hashCode() + (this.f69857b.hashCode() * 31)) * 31)) * 31);
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C1970n(this.f69858c, 28, this);
    }

    public final String toString() {
        return "GovernmentIdAnalyzeWorker(context=" + this.f69857b + ", governmentIdFeed=" + this.f69858c + ", side=" + this.f69859d + ", idClassKey=" + this.f69860e + Separators.RPAREN;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m22352b(C22100H c22100h, C18447U c18447u) {
        EnumC22094E enumC22094E;
        RawExtraction rawExtractionM22372i;
        c22100h.getClass();
        try {
            String absolutePath = AbstractC22121S.m22371h(c18447u.f58862b, c22100h.f69857b).getAbsolutePath();
            AbstractC16544l.m18093f(absolutePath, MpoABj.PZLYqwdCEMKnwYq);
            List listM9974d = AbstractC9393x3.m9974d(new C22205x(absolutePath));
            int iOrdinal = c18447u.f58861a.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    enumC22094E = EnumC22094E.f69839Z;
                } else {
                    throw new C0644w();
                }
            } else {
                enumC22094E = EnumC22094E.f69838Y;
            }
            EnumC22094E enumC22094E2 = enumC22094E;
            String str = c22100h.f69860e;
            C22207y c22207y = EnumC22088B.f69816Y;
            AbstractC18481o abstractC18481o = c18447u.f58864d;
            if (abstractC18481o != null) {
                rawExtractionM22372i = AbstractC22121S.m22372i(abstractC18481o);
            } else {
                rawExtractionM22372i = null;
            }
            return new C22090C(listM9974d, enumC22094E2, str, c22207y, rawExtractionM22372i, m22353c(c18447u));
        } catch (IOException e10) {
            return AbstractC9233X.m9806b(e10);
        }
    }
}
