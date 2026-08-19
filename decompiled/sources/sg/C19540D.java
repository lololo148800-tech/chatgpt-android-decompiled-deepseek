package sg;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17312o;
import p025An.C0644w;
import p098Di.InterfaceC2062k;
import p1113xn.AbstractC21322p;
import p571X9.AbstractC9233X;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17680n;
import p909nm.C17690x;

/* JADX INFO: renamed from: sg.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C19540D implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final EnumC19541E f62070a;

    /* JADX INFO: renamed from: b */
    public final C19581w f62071b;

    /* JADX INFO: renamed from: c */
    public final List f62072c;

    /* JADX INFO: renamed from: d */
    public final boolean f62073d;

    /* JADX INFO: renamed from: e */
    public final Map f62074e;

    /* JADX INFO: renamed from: f */
    public final C19578t f62075f;

    /* JADX INFO: renamed from: g */
    public final boolean f62076g;

    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    public C19540D(EnumC19541E enumC19541E, C19581w c19581w, List reportReasonStack, boolean z6, Map collectedAdditionalFields) {
        List list;
        Object objM9806b;
        boolean zBooleanValue;
        AbstractC16544l.m18094g(reportReasonStack, "reportReasonStack");
        AbstractC16544l.m18094g(collectedAdditionalFields, "collectedAdditionalFields");
        this.f62070a = enumC19541E;
        this.f62071b = c19581w;
        this.f62072c = reportReasonStack;
        this.f62073d = z6;
        this.f62074e = collectedAdditionalFields;
        C19578t c19578t = (C19578t) AbstractC17680n.m19353c0(reportReasonStack);
        this.f62075f = c19578t;
        boolean z10 = true;
        if (c19578t != null && (list = c19578t.f62176j) != null) {
            List<C19569k> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (C19569k c19569k : list2) {
                    String str = (String) this.f62074e.get(c19569k);
                    if (str == null) {
                        zBooleanValue = !c19569k.f62158d;
                    } else {
                        int iOrdinal = c19569k.f62156b.ordinal();
                        if (iOrdinal == 0) {
                            try {
                                new URL(str).toURI();
                                objM9806b = Boolean.TRUE;
                            } catch (Throwable th2) {
                                objM9806b = AbstractC9233X.m9806b(th2);
                            }
                            zBooleanValue = ((Boolean) (C17312o.m18979a(objM9806b) != null ? Boolean.FALSE : objM9806b)).booleanValue();
                        } else if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    throw new C0644w();
                                }
                                Pattern patternCompile = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
                                AbstractC16544l.m18093f(patternCompile, "compile(...)");
                                zBooleanValue = patternCompile.matcher(str).matches();
                            } else if (AbstractC21322p.m21681O(str)) {
                                zBooleanValue = false;
                            } else {
                                zBooleanValue = true;
                            }
                        } else if (AbstractC21322p.m21681O(str)) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    }
                    if (!zBooleanValue) {
                        z10 = false;
                        break;
                    }
                }
            }
        }
        this.f62076g = z10;
    }

    /* JADX INFO: renamed from: e */
    public static C19540D m20625e(C19540D c19540d, EnumC19541E enumC19541E, C19581w c19581w, List list, boolean z6, Map map, int i10) {
        if ((i10 & 1) != 0) {
            enumC19541E = c19540d.f62070a;
        }
        EnumC19541E enumC19541E2 = enumC19541E;
        if ((i10 & 2) != 0) {
            c19581w = c19540d.f62071b;
        }
        C19581w c19581w2 = c19581w;
        if ((i10 & 4) != 0) {
            list = c19540d.f62072c;
        }
        List reportReasonStack = list;
        if ((i10 & 8) != 0) {
            z6 = c19540d.f62073d;
        }
        boolean z10 = z6;
        if ((i10 & 16) != 0) {
            map = c19540d.f62074e;
        }
        Map collectedAdditionalFields = map;
        c19540d.getClass();
        AbstractC16544l.m18094g(reportReasonStack, "reportReasonStack");
        AbstractC16544l.m18094g(collectedAdditionalFields, "collectedAdditionalFields");
        return new C19540D(enumC19541E2, c19581w2, reportReasonStack, z10, collectedAdditionalFields);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19540D)) {
            return false;
        }
        C19540D c19540d = (C19540D) obj;
        return this.f62070a == c19540d.f62070a && AbstractC16544l.m18089b(this.f62071b, c19540d.f62071b) && AbstractC16544l.m18089b(this.f62072c, c19540d.f62072c) && this.f62073d == c19540d.f62073d && AbstractC16544l.m18089b(this.f62074e, c19540d.f62074e);
    }

    public final int hashCode() {
        EnumC19541E enumC19541E = this.f62070a;
        int iHashCode = (enumC19541E == null ? 0 : enumC19541E.hashCode()) * 31;
        C19581w c19581w = this.f62071b;
        return this.f62074e.hashCode() + ((AbstractC14376f.m15858x(this.f62072c, (iHashCode + (c19581w != null ? c19581w.hashCode() : 0)) * 31, 31) + (this.f62073d ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C19540D(C19581w c19581w, int i10) {
        this(null, (i10 & 2) != 0 ? null : c19581w, new ArrayList(), false, C17690x.f56481Y);
    }
}
