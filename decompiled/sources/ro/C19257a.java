package ro;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC16544l;
import mo.AbstractC17325B;
import mo.AbstractC17329F;
import mo.C17326C;
import mo.C17327D;
import mo.C17358y;
import mo.InterfaceC17350q;
import mo.InterfaceC17351r;
import no.AbstractC17708b;
import p005A3.C0326m;
import p026Ao.AbstractC0668b;
import p026Ao.C0656E;
import p523V9.AbstractC8162p0;
import p571X9.AbstractC9221V;
import p974qo.C18786b;
import p974qo.C18792h;
import p974qo.C18795k;
import to.C20010a;

/* JADX INFO: renamed from: ro.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C19257a implements InterfaceC17351r {

    /* JADX INFO: renamed from: a */
    public final boolean f61049a;

    public C19257a(boolean z6) {
        this.f61049a = z6;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x016b A[Catch: IOException -> 0x0168, TryCatch #10 {IOException -> 0x0168, blocks: (B:96:0x0153, B:100:0x015b, B:104:0x0179, B:106:0x0187, B:109:0x0190, B:116:0x01a5, B:118:0x01a9, B:122:0x01b6, B:124:0x01c9, B:126:0x01d3, B:127:0x01dd, B:111:0x0196, B:103:0x016b), top: B:154:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0187 A[Catch: IOException -> 0x0168, TryCatch #10 {IOException -> 0x0168, blocks: (B:96:0x0153, B:100:0x015b, B:104:0x0179, B:106:0x0187, B:109:0x0190, B:116:0x01a5, B:118:0x01a9, B:122:0x01b6, B:124:0x01c9, B:126:0x01d3, B:127:0x01dd, B:111:0x0196, B:103:0x016b), top: B:154:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x018f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0196 A[Catch: IOException -> 0x0168, TryCatch #10 {IOException -> 0x0168, blocks: (B:96:0x0153, B:100:0x015b, B:104:0x0179, B:106:0x0187, B:109:0x0190, B:116:0x01a5, B:118:0x01a9, B:122:0x01b6, B:124:0x01c9, B:126:0x01d3, B:127:0x01dd, B:111:0x0196, B:103:0x016b), top: B:154:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a5 A[Catch: IOException -> 0x0168, TryCatch #10 {IOException -> 0x0168, blocks: (B:96:0x0153, B:100:0x015b, B:104:0x0179, B:106:0x0187, B:109:0x0190, B:116:0x01a5, B:118:0x01a9, B:122:0x01b6, B:124:0x01c9, B:126:0x01d3, B:127:0x01dd, B:111:0x0196, B:103:0x016b), top: B:154:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01a9 A[Catch: IOException -> 0x0168, TryCatch #10 {IOException -> 0x0168, blocks: (B:96:0x0153, B:100:0x015b, B:104:0x0179, B:106:0x0187, B:109:0x0190, B:116:0x01a5, B:118:0x01a9, B:122:0x01b6, B:124:0x01c9, B:126:0x01d3, B:127:0x01dd, B:111:0x0196, B:103:0x016b), top: B:154:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b6 A[Catch: IOException -> 0x0168, TryCatch #10 {IOException -> 0x0168, blocks: (B:96:0x0153, B:100:0x015b, B:104:0x0179, B:106:0x0187, B:109:0x0190, B:116:0x01a5, B:118:0x01a9, B:122:0x01b6, B:124:0x01c9, B:126:0x01d3, B:127:0x01dd, B:111:0x0196, B:103:0x016b), top: B:154:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x01c9 A[Catch: IOException -> 0x0168, TryCatch #10 {IOException -> 0x0168, blocks: (B:96:0x0153, B:100:0x015b, B:104:0x0179, B:106:0x0187, B:109:0x0190, B:116:0x01a5, B:118:0x01a9, B:122:0x01b6, B:124:0x01c9, B:126:0x01d3, B:127:0x01dd, B:111:0x0196, B:103:0x016b), top: B:154:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f1 A[Catch: IOException -> 0x0100, TryCatch #12 {IOException -> 0x0100, blocks: (B:70:0x00e8, B:72:0x00f1, B:77:0x0102), top: B:158:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fd A[PHI: r16
      0x00fd: PHI (r16v3 mo.C) = (r16v2 mo.C), (r16v4 mo.C) binds: [B:68:0x00e5, B:71:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x011b  */
    /* JADX WARN: Code duplicated, block: B:82:0x011d  */
    /* JADX WARN: Code duplicated, block: B:89:0x012f A[Catch: IOException -> 0x014c, TryCatch #8 {IOException -> 0x014c, blocks: (B:79:0x010b, B:87:0x0126, B:89:0x012f, B:91:0x0137, B:94:0x014e), top: B:150:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0157  */
    @Override // mo.InterfaceC17351r
    public final C17327D intercept(InterfaceC17350q interfaceC17350q) throws Throwable {
        C17326C c17326cM963x;
        IOException iOException;
        C17326C c17326c;
        IOException iOException2;
        C17327D c17327dM18984a;
        int i10;
        C17327D c17327dM18984a2;
        AbstractC17329F abstractC17329F;
        long jMo18989a;
        AbstractC17329F abstractC17329F2;
        Long lValueOf;
        String strM19012f;
        IOException iOException3;
        C17326C c17326cM963x2;
        boolean z6;
        boolean z10;
        C19261e c19261e = (C19261e) interfaceC17350q;
        C0326m c0326m = c19261e.f61056d;
        AbstractC16544l.m18091d(c0326m);
        C18792h call = (C18792h) c0326m.f1140b;
        InterfaceC19259c interfaceC19259c = (InterfaceC19259c) c0326m.f1142d;
        C18795k c18795k = (C18795k) c0326m.f1143e;
        C17358y c17358y = c19261e.f61057e;
        AbstractC17325B abstractC17325B = c17358y.f55382d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z11 = true;
        try {
            try {
                AbstractC16544l.m18094g(call, "call");
                interfaceC19259c.mo18934g(c17358y);
                try {
                    if (!AbstractC8162p0.m8732d(c17358y.f55380b) || abstractC17325B == null) {
                        iOException3 = null;
                        call.m20066h(c0326m, true, false, null);
                        c17326cM963x = null;
                    } else {
                        try {
                            if ("100-continue".equalsIgnoreCase(c17358y.f55381c.m19012f("Expect"))) {
                                try {
                                    interfaceC19259c.mo18933f();
                                    c17326cM963x2 = c0326m.m963x(true);
                                    try {
                                        AbstractC16544l.m18094g(call, "call");
                                        z6 = false;
                                    } catch (IOException e10) {
                                        e = e10;
                                        c17326cM963x = c17326cM963x2;
                                        if (!(e instanceof C20010a)) {
                                            throw e;
                                        }
                                        if (c0326m.f1139a) {
                                            throw e;
                                        }
                                        iOException = e;
                                        if (c17326cM963x == null) {
                                            c17326c = c17326cM963x;
                                            c17326c.f55160a = c17358y;
                                            c17326c.f55164e = c18795k.f59742e;
                                            c17326c.f55170k = jCurrentTimeMillis;
                                            iOException2 = iOException;
                                            c17326c.f55171l = System.currentTimeMillis();
                                            c17327dM18984a = c17326c.m18984a();
                                            i10 = c17327dM18984a.f55176p0;
                                            if (i10 != 100) {
                                                C17326C c17326cM963x3 = c0326m.m963x(false);
                                                AbstractC16544l.m18091d(c17326cM963x3);
                                                if (z11) {
                                                    AbstractC16544l.m18094g(call, "call");
                                                }
                                                c17326cM963x3.f55160a = c17358y;
                                                c17326cM963x3.f55164e = c18795k.f59742e;
                                                c17326cM963x3.f55170k = jCurrentTimeMillis;
                                                c17326cM963x3.f55171l = System.currentTimeMillis();
                                                c17327dM18984a = c17326cM963x3.m18984a();
                                                i10 = c17327dM18984a.f55176p0;
                                            } else {
                                                C17326C c17326cM963x4 = c0326m.m963x(false);
                                                AbstractC16544l.m18091d(c17326cM963x4);
                                                if (z11) {
                                                    AbstractC16544l.m18094g(call, "call");
                                                }
                                                c17326cM963x4.f55160a = c17358y;
                                                c17326cM963x4.f55164e = c18795k.f59742e;
                                                c17326cM963x4.f55170k = jCurrentTimeMillis;
                                                c17326cM963x4.f55171l = System.currentTimeMillis();
                                                c17327dM18984a = c17326cM963x4.m18984a();
                                                i10 = c17327dM18984a.f55176p0;
                                            }
                                            AbstractC16544l.m18094g(call, "call");
                                            if (this.f61049a) {
                                                C17326C c17326cM18986e = c17327dM18984a.m18986e();
                                                c17326cM18986e.f55166g = c0326m.m960t(c17327dM18984a);
                                                c17327dM18984a2 = c17326cM18986e.m18984a();
                                            } else {
                                                C17326C c17326cM18986e2 = c17327dM18984a.m18986e();
                                                c17326cM18986e2.f55166g = c0326m.m960t(c17327dM18984a);
                                                c17327dM18984a2 = c17326cM18986e2.m18984a();
                                            }
                                            if ("close".equalsIgnoreCase(c17327dM18984a2.f55173Y.f55381c.m19012f("Connection"))) {
                                                interfaceC19259c.getConnection().m20080l();
                                            } else {
                                                strM19012f = c17327dM18984a2.f55178r0.m19012f("Connection");
                                                if (strM19012f == null) {
                                                    strM19012f = null;
                                                }
                                                if ("close".equalsIgnoreCase(strM19012f)) {
                                                    interfaceC19259c.getConnection().m20080l();
                                                }
                                            }
                                            if (i10 != 204) {
                                                abstractC17329F = c17327dM18984a2.f55179s0;
                                                if (abstractC17329F != null) {
                                                    jMo18989a = abstractC17329F.mo18989a();
                                                } else {
                                                    jMo18989a = -1;
                                                }
                                                if (jMo18989a > 0) {
                                                    StringBuilder sb2 = new StringBuilder("HTTP ");
                                                    sb2.append(i10);
                                                    sb2.append(" had non-zero Content-Length: ");
                                                    abstractC17329F2 = c17327dM18984a2.f55179s0;
                                                    if (abstractC17329F2 != null) {
                                                        lValueOf = Long.valueOf(abstractC17329F2.mo18989a());
                                                    } else {
                                                        lValueOf = null;
                                                    }
                                                    sb2.append(lValueOf);
                                                    throw new ProtocolException(sb2.toString());
                                                }
                                            } else {
                                                abstractC17329F = c17327dM18984a2.f55179s0;
                                                if (abstractC17329F != null) {
                                                    jMo18989a = abstractC17329F.mo18989a();
                                                } else {
                                                    jMo18989a = -1;
                                                }
                                                if (jMo18989a > 0) {
                                                    StringBuilder sb3 = new StringBuilder("HTTP ");
                                                    sb3.append(i10);
                                                    sb3.append(" had non-zero Content-Length: ");
                                                    abstractC17329F2 = c17327dM18984a2.f55179s0;
                                                    if (abstractC17329F2 != null) {
                                                        lValueOf = Long.valueOf(abstractC17329F2.mo18989a());
                                                    } else {
                                                        lValueOf = null;
                                                    }
                                                    sb3.append(lValueOf);
                                                    throw new ProtocolException(sb3.toString());
                                                }
                                            }
                                            return c17327dM18984a2;
                                        }
                                        try {
                                            c17326cM963x = c0326m.m963x(false);
                                            AbstractC16544l.m18091d(c17326cM963x);
                                            if (z11) {
                                                AbstractC16544l.m18094g(call, "call");
                                                c17326c = c17326cM963x;
                                                z11 = false;
                                            } else {
                                                c17326c = c17326cM963x;
                                            }
                                            c17326c.f55160a = c17358y;
                                            c17326c.f55164e = c18795k.f59742e;
                                            c17326c.f55170k = jCurrentTimeMillis;
                                            iOException2 = iOException;
                                            try {
                                                c17326c.f55171l = System.currentTimeMillis();
                                                c17327dM18984a = c17326c.m18984a();
                                                i10 = c17327dM18984a.f55176p0;
                                                if (i10 != 100) {
                                                    C17326C c17326cM963x5 = c0326m.m963x(false);
                                                    AbstractC16544l.m18091d(c17326cM963x5);
                                                    if (z11) {
                                                        AbstractC16544l.m18094g(call, "call");
                                                    }
                                                    c17326cM963x5.f55160a = c17358y;
                                                    c17326cM963x5.f55164e = c18795k.f59742e;
                                                    c17326cM963x5.f55170k = jCurrentTimeMillis;
                                                    c17326cM963x5.f55171l = System.currentTimeMillis();
                                                    c17327dM18984a = c17326cM963x5.m18984a();
                                                    i10 = c17327dM18984a.f55176p0;
                                                } else {
                                                    C17326C c17326cM963x6 = c0326m.m963x(false);
                                                    AbstractC16544l.m18091d(c17326cM963x6);
                                                    if (z11) {
                                                        AbstractC16544l.m18094g(call, "call");
                                                    }
                                                    c17326cM963x6.f55160a = c17358y;
                                                    c17326cM963x6.f55164e = c18795k.f59742e;
                                                    c17326cM963x6.f55170k = jCurrentTimeMillis;
                                                    c17326cM963x6.f55171l = System.currentTimeMillis();
                                                    c17327dM18984a = c17326cM963x6.m18984a();
                                                    i10 = c17327dM18984a.f55176p0;
                                                }
                                                AbstractC16544l.m18094g(call, "call");
                                                try {
                                                    if (this.f61049a) {
                                                        C17326C c17326cM18986e3 = c17327dM18984a.m18986e();
                                                        c17326cM18986e3.f55166g = c0326m.m960t(c17327dM18984a);
                                                        c17327dM18984a2 = c17326cM18986e3.m18984a();
                                                    } else {
                                                        C17326C c17326cM18986e4 = c17327dM18984a.m18986e();
                                                        c17326cM18986e4.f55166g = c0326m.m960t(c17327dM18984a);
                                                        c17327dM18984a2 = c17326cM18986e4.m18984a();
                                                    }
                                                    if ("close".equalsIgnoreCase(c17327dM18984a2.f55173Y.f55381c.m19012f("Connection"))) {
                                                        interfaceC19259c.getConnection().m20080l();
                                                    } else {
                                                        strM19012f = c17327dM18984a2.f55178r0.m19012f("Connection");
                                                        if (strM19012f == null) {
                                                            strM19012f = null;
                                                        }
                                                        if ("close".equalsIgnoreCase(strM19012f)) {
                                                            interfaceC19259c.getConnection().m20080l();
                                                        }
                                                    }
                                                    if (i10 != 204) {
                                                        abstractC17329F = c17327dM18984a2.f55179s0;
                                                        if (abstractC17329F != null) {
                                                            jMo18989a = abstractC17329F.mo18989a();
                                                        } else {
                                                            jMo18989a = -1;
                                                        }
                                                        if (jMo18989a > 0) {
                                                            StringBuilder sb4 = new StringBuilder("HTTP ");
                                                            sb4.append(i10);
                                                            sb4.append(" had non-zero Content-Length: ");
                                                            abstractC17329F2 = c17327dM18984a2.f55179s0;
                                                            if (abstractC17329F2 != null) {
                                                                lValueOf = Long.valueOf(abstractC17329F2.mo18989a());
                                                            } else {
                                                                lValueOf = null;
                                                            }
                                                            sb4.append(lValueOf);
                                                            throw new ProtocolException(sb4.toString());
                                                        }
                                                    } else {
                                                        abstractC17329F = c17327dM18984a2.f55179s0;
                                                        if (abstractC17329F != null) {
                                                            jMo18989a = abstractC17329F.mo18989a();
                                                        } else {
                                                            jMo18989a = -1;
                                                        }
                                                        if (jMo18989a > 0) {
                                                            StringBuilder sb5 = new StringBuilder("HTTP ");
                                                            sb5.append(i10);
                                                            sb5.append(" had non-zero Content-Length: ");
                                                            abstractC17329F2 = c17327dM18984a2.f55179s0;
                                                            if (abstractC17329F2 != null) {
                                                                lValueOf = Long.valueOf(abstractC17329F2.mo18989a());
                                                            } else {
                                                                lValueOf = null;
                                                            }
                                                            sb5.append(lValueOf);
                                                            throw new ProtocolException(sb5.toString());
                                                        }
                                                    }
                                                    return c17327dM18984a2;
                                                } catch (IOException e11) {
                                                    e = e11;
                                                }
                                            } catch (IOException e12) {
                                                e = e12;
                                            }
                                        } catch (IOException e13) {
                                            e = e13;
                                            iOException2 = iOException;
                                        }
                                        if (iOException2 == null) {
                                            throw e;
                                        }
                                        IOException iOException4 = iOException2;
                                        AbstractC9221V.m9789a(iOException4, e);
                                        throw iOException4;
                                    }
                                } catch (IOException e14) {
                                    AbstractC16544l.m18094g(call, "call");
                                    c0326m.m964y(e14);
                                    throw e14;
                                }
                            } else {
                                z6 = true;
                                c17326cM963x2 = null;
                            }
                            try {
                                if (c17326cM963x2 == null) {
                                    try {
                                        AbstractC17325B abstractC17325B2 = c17358y.f55382d;
                                        AbstractC16544l.m18091d(abstractC17325B2);
                                        long jMo4142a = abstractC17325B2.mo4142a();
                                        AbstractC16544l.m18094g(call, "call");
                                        c17326cM963x = c17326cM963x2;
                                        try {
                                            z10 = z6;
                                            C0656E c0656eM1402b = AbstractC0668b.m1402b(new C18786b(c0326m, interfaceC19259c.mo18930c(c17358y, jMo4142a), jMo4142a));
                                            abstractC17325B.mo4145d(c0656eM1402b);
                                            c0656eM1402b.close();
                                        } catch (IOException e15) {
                                            e = e15;
                                            z10 = z6;
                                            z11 = z10;
                                            if (!(e instanceof C20010a)) {
                                                throw e;
                                            }
                                            if (c0326m.f1139a) {
                                                throw e;
                                            }
                                            iOException = e;
                                            if (c17326cM963x == null) {
                                                c17326c = c17326cM963x;
                                                c17326c.f55160a = c17358y;
                                                c17326c.f55164e = c18795k.f59742e;
                                                c17326c.f55170k = jCurrentTimeMillis;
                                                iOException2 = iOException;
                                                c17326c.f55171l = System.currentTimeMillis();
                                                c17327dM18984a = c17326c.m18984a();
                                                i10 = c17327dM18984a.f55176p0;
                                                if (i10 != 100) {
                                                    C17326C c17326cM963x7 = c0326m.m963x(false);
                                                    AbstractC16544l.m18091d(c17326cM963x7);
                                                    if (z11) {
                                                        AbstractC16544l.m18094g(call, "call");
                                                    }
                                                    c17326cM963x7.f55160a = c17358y;
                                                    c17326cM963x7.f55164e = c18795k.f59742e;
                                                    c17326cM963x7.f55170k = jCurrentTimeMillis;
                                                    c17326cM963x7.f55171l = System.currentTimeMillis();
                                                    c17327dM18984a = c17326cM963x7.m18984a();
                                                    i10 = c17327dM18984a.f55176p0;
                                                } else {
                                                    C17326C c17326cM963x8 = c0326m.m963x(false);
                                                    AbstractC16544l.m18091d(c17326cM963x8);
                                                    if (z11) {
                                                        AbstractC16544l.m18094g(call, "call");
                                                    }
                                                    c17326cM963x8.f55160a = c17358y;
                                                    c17326cM963x8.f55164e = c18795k.f59742e;
                                                    c17326cM963x8.f55170k = jCurrentTimeMillis;
                                                    c17326cM963x8.f55171l = System.currentTimeMillis();
                                                    c17327dM18984a = c17326cM963x8.m18984a();
                                                    i10 = c17327dM18984a.f55176p0;
                                                }
                                                AbstractC16544l.m18094g(call, "call");
                                                if (this.f61049a) {
                                                    C17326C c17326cM18986e5 = c17327dM18984a.m18986e();
                                                    c17326cM18986e5.f55166g = c0326m.m960t(c17327dM18984a);
                                                    c17327dM18984a2 = c17326cM18986e5.m18984a();
                                                } else {
                                                    C17326C c17326cM18986e6 = c17327dM18984a.m18986e();
                                                    c17326cM18986e6.f55166g = c0326m.m960t(c17327dM18984a);
                                                    c17327dM18984a2 = c17326cM18986e6.m18984a();
                                                }
                                                if ("close".equalsIgnoreCase(c17327dM18984a2.f55173Y.f55381c.m19012f("Connection"))) {
                                                    interfaceC19259c.getConnection().m20080l();
                                                } else {
                                                    strM19012f = c17327dM18984a2.f55178r0.m19012f("Connection");
                                                    if (strM19012f == null) {
                                                        strM19012f = null;
                                                    }
                                                    if ("close".equalsIgnoreCase(strM19012f)) {
                                                        interfaceC19259c.getConnection().m20080l();
                                                    }
                                                }
                                                if (i10 != 204) {
                                                    abstractC17329F = c17327dM18984a2.f55179s0;
                                                    if (abstractC17329F != null) {
                                                        jMo18989a = abstractC17329F.mo18989a();
                                                    } else {
                                                        jMo18989a = -1;
                                                    }
                                                    if (jMo18989a > 0) {
                                                        StringBuilder sb6 = new StringBuilder("HTTP ");
                                                        sb6.append(i10);
                                                        sb6.append(" had non-zero Content-Length: ");
                                                        abstractC17329F2 = c17327dM18984a2.f55179s0;
                                                        if (abstractC17329F2 != null) {
                                                            lValueOf = Long.valueOf(abstractC17329F2.mo18989a());
                                                        } else {
                                                            lValueOf = null;
                                                        }
                                                        sb6.append(lValueOf);
                                                        throw new ProtocolException(sb6.toString());
                                                    }
                                                } else {
                                                    abstractC17329F = c17327dM18984a2.f55179s0;
                                                    if (abstractC17329F != null) {
                                                        jMo18989a = abstractC17329F.mo18989a();
                                                    } else {
                                                        jMo18989a = -1;
                                                    }
                                                    if (jMo18989a > 0) {
                                                        StringBuilder sb7 = new StringBuilder("HTTP ");
                                                        sb7.append(i10);
                                                        sb7.append(" had non-zero Content-Length: ");
                                                        abstractC17329F2 = c17327dM18984a2.f55179s0;
                                                        if (abstractC17329F2 != null) {
                                                            lValueOf = Long.valueOf(abstractC17329F2.mo18989a());
                                                        } else {
                                                            lValueOf = null;
                                                        }
                                                        sb7.append(lValueOf);
                                                        throw new ProtocolException(sb7.toString());
                                                    }
                                                }
                                                return c17327dM18984a2;
                                            }
                                            c17326cM963x = c0326m.m963x(false);
                                            AbstractC16544l.m18091d(c17326cM963x);
                                            if (z11) {
                                                AbstractC16544l.m18094g(call, "call");
                                                c17326c = c17326cM963x;
                                                z11 = false;
                                            } else {
                                                c17326c = c17326cM963x;
                                            }
                                            c17326c.f55160a = c17358y;
                                            c17326c.f55164e = c18795k.f59742e;
                                            c17326c.f55170k = jCurrentTimeMillis;
                                            iOException2 = iOException;
                                            c17326c.f55171l = System.currentTimeMillis();
                                            c17327dM18984a = c17326c.m18984a();
                                            i10 = c17327dM18984a.f55176p0;
                                            if (i10 != 100) {
                                                C17326C c17326cM963x9 = c0326m.m963x(false);
                                                AbstractC16544l.m18091d(c17326cM963x9);
                                                if (z11) {
                                                    AbstractC16544l.m18094g(call, "call");
                                                }
                                                c17326cM963x9.f55160a = c17358y;
                                                c17326cM963x9.f55164e = c18795k.f59742e;
                                                c17326cM963x9.f55170k = jCurrentTimeMillis;
                                                c17326cM963x9.f55171l = System.currentTimeMillis();
                                                c17327dM18984a = c17326cM963x9.m18984a();
                                                i10 = c17327dM18984a.f55176p0;
                                            } else {
                                                C17326C c17326cM963x10 = c0326m.m963x(false);
                                                AbstractC16544l.m18091d(c17326cM963x10);
                                                if (z11) {
                                                    AbstractC16544l.m18094g(call, "call");
                                                }
                                                c17326cM963x10.f55160a = c17358y;
                                                c17326cM963x10.f55164e = c18795k.f59742e;
                                                c17326cM963x10.f55170k = jCurrentTimeMillis;
                                                c17326cM963x10.f55171l = System.currentTimeMillis();
                                                c17327dM18984a = c17326cM963x10.m18984a();
                                                i10 = c17327dM18984a.f55176p0;
                                            }
                                            AbstractC16544l.m18094g(call, "call");
                                            if (this.f61049a) {
                                                C17326C c17326cM18986e7 = c17327dM18984a.m18986e();
                                                c17326cM18986e7.f55166g = c0326m.m960t(c17327dM18984a);
                                                c17327dM18984a2 = c17326cM18986e7.m18984a();
                                            } else {
                                                C17326C c17326cM18986e8 = c17327dM18984a.m18986e();
                                                c17326cM18986e8.f55166g = c0326m.m960t(c17327dM18984a);
                                                c17327dM18984a2 = c17326cM18986e8.m18984a();
                                            }
                                            if ("close".equalsIgnoreCase(c17327dM18984a2.f55173Y.f55381c.m19012f("Connection"))) {
                                                interfaceC19259c.getConnection().m20080l();
                                            } else {
                                                strM19012f = c17327dM18984a2.f55178r0.m19012f("Connection");
                                                if (strM19012f == null) {
                                                    strM19012f = null;
                                                }
                                                if ("close".equalsIgnoreCase(strM19012f)) {
                                                    interfaceC19259c.getConnection().m20080l();
                                                }
                                            }
                                            if (i10 != 204) {
                                                abstractC17329F = c17327dM18984a2.f55179s0;
                                                if (abstractC17329F != null) {
                                                    jMo18989a = abstractC17329F.mo18989a();
                                                } else {
                                                    jMo18989a = -1;
                                                }
                                                if (jMo18989a > 0) {
                                                    StringBuilder sb8 = new StringBuilder("HTTP ");
                                                    sb8.append(i10);
                                                    sb8.append(" had non-zero Content-Length: ");
                                                    abstractC17329F2 = c17327dM18984a2.f55179s0;
                                                    if (abstractC17329F2 != null) {
                                                        lValueOf = Long.valueOf(abstractC17329F2.mo18989a());
                                                    } else {
                                                        lValueOf = null;
                                                    }
                                                    sb8.append(lValueOf);
                                                    throw new ProtocolException(sb8.toString());
                                                }
                                            } else {
                                                abstractC17329F = c17327dM18984a2.f55179s0;
                                                if (abstractC17329F != null) {
                                                    jMo18989a = abstractC17329F.mo18989a();
                                                } else {
                                                    jMo18989a = -1;
                                                }
                                                if (jMo18989a > 0) {
                                                    StringBuilder sb9 = new StringBuilder("HTTP ");
                                                    sb9.append(i10);
                                                    sb9.append(" had non-zero Content-Length: ");
                                                    abstractC17329F2 = c17327dM18984a2.f55179s0;
                                                    if (abstractC17329F2 != null) {
                                                        lValueOf = Long.valueOf(abstractC17329F2.mo18989a());
                                                    } else {
                                                        lValueOf = null;
                                                    }
                                                    sb9.append(lValueOf);
                                                    throw new ProtocolException(sb9.toString());
                                                }
                                            }
                                            return c17327dM18984a2;
                                            if (iOException2 == null) {
                                                throw e;
                                            }
                                            IOException iOException5 = iOException2;
                                            AbstractC9221V.m9789a(iOException5, e);
                                            throw iOException5;
                                        }
                                    } catch (IOException e16) {
                                        e = e16;
                                        c17326cM963x = c17326cM963x2;
                                    }
                                } else {
                                    c17326cM963x = c17326cM963x2;
                                    z10 = z6;
                                    call.m20066h(c0326m, true, false, null);
                                    if (c18795k.f59744g == null) {
                                        z11 = false;
                                    }
                                    if (!z11) {
                                        interfaceC19259c.getConnection().m20080l();
                                    }
                                }
                                z11 = z10;
                                iOException3 = null;
                            } catch (IOException e17) {
                                e = e17;
                            }
                        } catch (IOException e18) {
                            e = e18;
                            c17326cM963x = null;
                        }
                    }
                    try {
                        interfaceC19259c.mo18928a();
                        iOException = iOException3;
                        if (c17326cM963x == null) {
                            c17326cM963x = c0326m.m963x(false);
                            AbstractC16544l.m18091d(c17326cM963x);
                            if (z11) {
                                AbstractC16544l.m18094g(call, "call");
                                c17326c = c17326cM963x;
                                z11 = false;
                            } else {
                                c17326c = c17326cM963x;
                            }
                            c17326c.f55160a = c17358y;
                            c17326c.f55164e = c18795k.f59742e;
                            c17326c.f55170k = jCurrentTimeMillis;
                            iOException2 = iOException;
                            c17326c.f55171l = System.currentTimeMillis();
                            c17327dM18984a = c17326c.m18984a();
                            i10 = c17327dM18984a.f55176p0;
                            if (i10 != 100 || (102 <= i10 && i10 < 200)) {
                                C17326C c17326cM963x11 = c0326m.m963x(false);
                                AbstractC16544l.m18091d(c17326cM963x11);
                                if (z11) {
                                    AbstractC16544l.m18094g(call, "call");
                                }
                                c17326cM963x11.f55160a = c17358y;
                                c17326cM963x11.f55164e = c18795k.f59742e;
                                c17326cM963x11.f55170k = jCurrentTimeMillis;
                                c17326cM963x11.f55171l = System.currentTimeMillis();
                                c17327dM18984a = c17326cM963x11.m18984a();
                                i10 = c17327dM18984a.f55176p0;
                            }
                            AbstractC16544l.m18094g(call, "call");
                            if (this.f61049a || i10 != 101) {
                                C17326C c17326cM18986e9 = c17327dM18984a.m18986e();
                                c17326cM18986e9.f55166g = c0326m.m960t(c17327dM18984a);
                                c17327dM18984a2 = c17326cM18986e9.m18984a();
                            } else {
                                C17326C c17326cM18986e10 = c17327dM18984a.m18986e();
                                c17326cM18986e10.f55166g = AbstractC17708b.f56538c;
                                c17327dM18984a2 = c17326cM18986e10.m18984a();
                            }
                            if ("close".equalsIgnoreCase(c17327dM18984a2.f55173Y.f55381c.m19012f("Connection"))) {
                                interfaceC19259c.getConnection().m20080l();
                            } else {
                                strM19012f = c17327dM18984a2.f55178r0.m19012f("Connection");
                                if (strM19012f == null) {
                                    strM19012f = null;
                                }
                                if ("close".equalsIgnoreCase(strM19012f)) {
                                    interfaceC19259c.getConnection().m20080l();
                                }
                            }
                            if (i10 != 204 || i10 == 205) {
                                abstractC17329F = c17327dM18984a2.f55179s0;
                                if (abstractC17329F != null) {
                                    jMo18989a = abstractC17329F.mo18989a();
                                } else {
                                    jMo18989a = -1;
                                }
                                if (jMo18989a > 0) {
                                    StringBuilder sb10 = new StringBuilder("HTTP ");
                                    sb10.append(i10);
                                    sb10.append(" had non-zero Content-Length: ");
                                    abstractC17329F2 = c17327dM18984a2.f55179s0;
                                    if (abstractC17329F2 != null) {
                                        lValueOf = Long.valueOf(abstractC17329F2.mo18989a());
                                    } else {
                                        lValueOf = null;
                                    }
                                    sb10.append(lValueOf);
                                    throw new ProtocolException(sb10.toString());
                                }
                            }
                            return c17327dM18984a2;
                        }
                        c17326c = c17326cM963x;
                        c17326c.f55160a = c17358y;
                        c17326c.f55164e = c18795k.f59742e;
                        c17326c.f55170k = jCurrentTimeMillis;
                        iOException2 = iOException;
                        c17326c.f55171l = System.currentTimeMillis();
                        c17327dM18984a = c17326c.m18984a();
                        i10 = c17327dM18984a.f55176p0;
                        if (i10 != 100) {
                            C17326C c17326cM963x12 = c0326m.m963x(false);
                            AbstractC16544l.m18091d(c17326cM963x12);
                            if (z11) {
                                AbstractC16544l.m18094g(call, "call");
                            }
                            c17326cM963x12.f55160a = c17358y;
                            c17326cM963x12.f55164e = c18795k.f59742e;
                            c17326cM963x12.f55170k = jCurrentTimeMillis;
                            c17326cM963x12.f55171l = System.currentTimeMillis();
                            c17327dM18984a = c17326cM963x12.m18984a();
                            i10 = c17327dM18984a.f55176p0;
                        } else {
                            C17326C c17326cM963x13 = c0326m.m963x(false);
                            AbstractC16544l.m18091d(c17326cM963x13);
                            if (z11) {
                                AbstractC16544l.m18094g(call, "call");
                            }
                            c17326cM963x13.f55160a = c17358y;
                            c17326cM963x13.f55164e = c18795k.f59742e;
                            c17326cM963x13.f55170k = jCurrentTimeMillis;
                            c17326cM963x13.f55171l = System.currentTimeMillis();
                            c17327dM18984a = c17326cM963x13.m18984a();
                            i10 = c17327dM18984a.f55176p0;
                        }
                        AbstractC16544l.m18094g(call, "call");
                        if (this.f61049a) {
                            C17326C c17326cM18986e11 = c17327dM18984a.m18986e();
                            c17326cM18986e11.f55166g = c0326m.m960t(c17327dM18984a);
                            c17327dM18984a2 = c17326cM18986e11.m18984a();
                        } else {
                            C17326C c17326cM18986e12 = c17327dM18984a.m18986e();
                            c17326cM18986e12.f55166g = c0326m.m960t(c17327dM18984a);
                            c17327dM18984a2 = c17326cM18986e12.m18984a();
                        }
                        if ("close".equalsIgnoreCase(c17327dM18984a2.f55173Y.f55381c.m19012f("Connection"))) {
                            interfaceC19259c.getConnection().m20080l();
                        } else {
                            strM19012f = c17327dM18984a2.f55178r0.m19012f("Connection");
                            if (strM19012f == null) {
                                strM19012f = null;
                            }
                            if ("close".equalsIgnoreCase(strM19012f)) {
                                interfaceC19259c.getConnection().m20080l();
                            }
                        }
                        if (i10 != 204) {
                            abstractC17329F = c17327dM18984a2.f55179s0;
                            if (abstractC17329F != null) {
                                jMo18989a = abstractC17329F.mo18989a();
                            } else {
                                jMo18989a = -1;
                            }
                            if (jMo18989a > 0) {
                                StringBuilder sb11 = new StringBuilder("HTTP ");
                                sb11.append(i10);
                                sb11.append(" had non-zero Content-Length: ");
                                abstractC17329F2 = c17327dM18984a2.f55179s0;
                                if (abstractC17329F2 != null) {
                                    lValueOf = Long.valueOf(abstractC17329F2.mo18989a());
                                } else {
                                    lValueOf = null;
                                }
                                sb11.append(lValueOf);
                                throw new ProtocolException(sb11.toString());
                            }
                        } else {
                            abstractC17329F = c17327dM18984a2.f55179s0;
                            if (abstractC17329F != null) {
                                jMo18989a = abstractC17329F.mo18989a();
                            } else {
                                jMo18989a = -1;
                            }
                            if (jMo18989a > 0) {
                                StringBuilder sb12 = new StringBuilder("HTTP ");
                                sb12.append(i10);
                                sb12.append(" had non-zero Content-Length: ");
                                abstractC17329F2 = c17327dM18984a2.f55179s0;
                                if (abstractC17329F2 != null) {
                                    lValueOf = Long.valueOf(abstractC17329F2.mo18989a());
                                } else {
                                    lValueOf = null;
                                }
                                sb12.append(lValueOf);
                                throw new ProtocolException(sb12.toString());
                            }
                        }
                        return c17327dM18984a2;
                        if (iOException2 == null) {
                            throw e;
                        }
                        IOException iOException6 = iOException2;
                        AbstractC9221V.m9789a(iOException6, e);
                        throw iOException6;
                    } catch (IOException e19) {
                        try {
                            c0326m.m964y(e19);
                            throw e19;
                        } catch (IOException e20) {
                            e = e20;
                            if (!(e instanceof C20010a)) {
                                throw e;
                            }
                            if (c0326m.f1139a) {
                                throw e;
                            }
                            iOException = e;
                            if (c17326cM963x == null) {
                                c17326c = c17326cM963x;
                                c17326c.f55160a = c17358y;
                                c17326c.f55164e = c18795k.f59742e;
                                c17326c.f55170k = jCurrentTimeMillis;
                                iOException2 = iOException;
                                c17326c.f55171l = System.currentTimeMillis();
                                c17327dM18984a = c17326c.m18984a();
                                i10 = c17327dM18984a.f55176p0;
                                if (i10 != 100) {
                                    C17326C c17326cM963x14 = c0326m.m963x(false);
                                    AbstractC16544l.m18091d(c17326cM963x14);
                                    if (z11) {
                                        AbstractC16544l.m18094g(call, "call");
                                    }
                                    c17326cM963x14.f55160a = c17358y;
                                    c17326cM963x14.f55164e = c18795k.f59742e;
                                    c17326cM963x14.f55170k = jCurrentTimeMillis;
                                    c17326cM963x14.f55171l = System.currentTimeMillis();
                                    c17327dM18984a = c17326cM963x14.m18984a();
                                    i10 = c17327dM18984a.f55176p0;
                                } else {
                                    C17326C c17326cM963x15 = c0326m.m963x(false);
                                    AbstractC16544l.m18091d(c17326cM963x15);
                                    if (z11) {
                                        AbstractC16544l.m18094g(call, "call");
                                    }
                                    c17326cM963x15.f55160a = c17358y;
                                    c17326cM963x15.f55164e = c18795k.f59742e;
                                    c17326cM963x15.f55170k = jCurrentTimeMillis;
                                    c17326cM963x15.f55171l = System.currentTimeMillis();
                                    c17327dM18984a = c17326cM963x15.m18984a();
                                    i10 = c17327dM18984a.f55176p0;
                                }
                                AbstractC16544l.m18094g(call, "call");
                                if (this.f61049a) {
                                    C17326C c17326cM18986e13 = c17327dM18984a.m18986e();
                                    c17326cM18986e13.f55166g = c0326m.m960t(c17327dM18984a);
                                    c17327dM18984a2 = c17326cM18986e13.m18984a();
                                } else {
                                    C17326C c17326cM18986e14 = c17327dM18984a.m18986e();
                                    c17326cM18986e14.f55166g = c0326m.m960t(c17327dM18984a);
                                    c17327dM18984a2 = c17326cM18986e14.m18984a();
                                }
                                if ("close".equalsIgnoreCase(c17327dM18984a2.f55173Y.f55381c.m19012f("Connection"))) {
                                    interfaceC19259c.getConnection().m20080l();
                                } else {
                                    strM19012f = c17327dM18984a2.f55178r0.m19012f("Connection");
                                    if (strM19012f == null) {
                                        strM19012f = null;
                                    }
                                    if ("close".equalsIgnoreCase(strM19012f)) {
                                        interfaceC19259c.getConnection().m20080l();
                                    }
                                }
                                if (i10 != 204) {
                                    abstractC17329F = c17327dM18984a2.f55179s0;
                                    if (abstractC17329F != null) {
                                        jMo18989a = abstractC17329F.mo18989a();
                                    } else {
                                        jMo18989a = -1;
                                    }
                                    if (jMo18989a > 0) {
                                        StringBuilder sb13 = new StringBuilder("HTTP ");
                                        sb13.append(i10);
                                        sb13.append(" had non-zero Content-Length: ");
                                        abstractC17329F2 = c17327dM18984a2.f55179s0;
                                        if (abstractC17329F2 != null) {
                                            lValueOf = Long.valueOf(abstractC17329F2.mo18989a());
                                        } else {
                                            lValueOf = null;
                                        }
                                        sb13.append(lValueOf);
                                        throw new ProtocolException(sb13.toString());
                                    }
                                } else {
                                    abstractC17329F = c17327dM18984a2.f55179s0;
                                    if (abstractC17329F != null) {
                                        jMo18989a = abstractC17329F.mo18989a();
                                    } else {
                                        jMo18989a = -1;
                                    }
                                    if (jMo18989a > 0) {
                                        StringBuilder sb14 = new StringBuilder("HTTP ");
                                        sb14.append(i10);
                                        sb14.append(" had non-zero Content-Length: ");
                                        abstractC17329F2 = c17327dM18984a2.f55179s0;
                                        if (abstractC17329F2 != null) {
                                            lValueOf = Long.valueOf(abstractC17329F2.mo18989a());
                                        } else {
                                            lValueOf = null;
                                        }
                                        sb14.append(lValueOf);
                                        throw new ProtocolException(sb14.toString());
                                    }
                                }
                                return c17327dM18984a2;
                            }
                            c17326cM963x = c0326m.m963x(false);
                            AbstractC16544l.m18091d(c17326cM963x);
                            if (z11) {
                                AbstractC16544l.m18094g(call, "call");
                                c17326c = c17326cM963x;
                                z11 = false;
                            } else {
                                c17326c = c17326cM963x;
                            }
                            c17326c.f55160a = c17358y;
                            c17326c.f55164e = c18795k.f59742e;
                            c17326c.f55170k = jCurrentTimeMillis;
                            iOException2 = iOException;
                            c17326c.f55171l = System.currentTimeMillis();
                            c17327dM18984a = c17326c.m18984a();
                            i10 = c17327dM18984a.f55176p0;
                            if (i10 != 100) {
                                C17326C c17326cM963x16 = c0326m.m963x(false);
                                AbstractC16544l.m18091d(c17326cM963x16);
                                if (z11) {
                                    AbstractC16544l.m18094g(call, "call");
                                }
                                c17326cM963x16.f55160a = c17358y;
                                c17326cM963x16.f55164e = c18795k.f59742e;
                                c17326cM963x16.f55170k = jCurrentTimeMillis;
                                c17326cM963x16.f55171l = System.currentTimeMillis();
                                c17327dM18984a = c17326cM963x16.m18984a();
                                i10 = c17327dM18984a.f55176p0;
                            } else {
                                C17326C c17326cM963x17 = c0326m.m963x(false);
                                AbstractC16544l.m18091d(c17326cM963x17);
                                if (z11) {
                                    AbstractC16544l.m18094g(call, "call");
                                }
                                c17326cM963x17.f55160a = c17358y;
                                c17326cM963x17.f55164e = c18795k.f59742e;
                                c17326cM963x17.f55170k = jCurrentTimeMillis;
                                c17326cM963x17.f55171l = System.currentTimeMillis();
                                c17327dM18984a = c17326cM963x17.m18984a();
                                i10 = c17327dM18984a.f55176p0;
                            }
                            AbstractC16544l.m18094g(call, "call");
                            if (this.f61049a) {
                                C17326C c17326cM18986e15 = c17327dM18984a.m18986e();
                                c17326cM18986e15.f55166g = c0326m.m960t(c17327dM18984a);
                                c17327dM18984a2 = c17326cM18986e15.m18984a();
                            } else {
                                C17326C c17326cM18986e16 = c17327dM18984a.m18986e();
                                c17326cM18986e16.f55166g = c0326m.m960t(c17327dM18984a);
                                c17327dM18984a2 = c17326cM18986e16.m18984a();
                            }
                            if ("close".equalsIgnoreCase(c17327dM18984a2.f55173Y.f55381c.m19012f("Connection"))) {
                                interfaceC19259c.getConnection().m20080l();
                            } else {
                                strM19012f = c17327dM18984a2.f55178r0.m19012f("Connection");
                                if (strM19012f == null) {
                                    strM19012f = null;
                                }
                                if ("close".equalsIgnoreCase(strM19012f)) {
                                    interfaceC19259c.getConnection().m20080l();
                                }
                            }
                            if (i10 != 204) {
                                abstractC17329F = c17327dM18984a2.f55179s0;
                                if (abstractC17329F != null) {
                                    jMo18989a = abstractC17329F.mo18989a();
                                } else {
                                    jMo18989a = -1;
                                }
                                if (jMo18989a > 0) {
                                    StringBuilder sb15 = new StringBuilder("HTTP ");
                                    sb15.append(i10);
                                    sb15.append(" had non-zero Content-Length: ");
                                    abstractC17329F2 = c17327dM18984a2.f55179s0;
                                    if (abstractC17329F2 != null) {
                                        lValueOf = Long.valueOf(abstractC17329F2.mo18989a());
                                    } else {
                                        lValueOf = null;
                                    }
                                    sb15.append(lValueOf);
                                    throw new ProtocolException(sb15.toString());
                                }
                            } else {
                                abstractC17329F = c17327dM18984a2.f55179s0;
                                if (abstractC17329F != null) {
                                    jMo18989a = abstractC17329F.mo18989a();
                                } else {
                                    jMo18989a = -1;
                                }
                                if (jMo18989a > 0) {
                                    StringBuilder sb16 = new StringBuilder("HTTP ");
                                    sb16.append(i10);
                                    sb16.append(" had non-zero Content-Length: ");
                                    abstractC17329F2 = c17327dM18984a2.f55179s0;
                                    if (abstractC17329F2 != null) {
                                        lValueOf = Long.valueOf(abstractC17329F2.mo18989a());
                                    } else {
                                        lValueOf = null;
                                    }
                                    sb16.append(lValueOf);
                                    throw new ProtocolException(sb16.toString());
                                }
                            }
                            return c17327dM18984a2;
                            if (iOException2 == null) {
                                throw e;
                            }
                            IOException iOException7 = iOException2;
                            AbstractC9221V.m9789a(iOException7, e);
                            throw iOException7;
                        }
                    }
                } catch (IOException e21) {
                    e = e21;
                    c17326cM963x = null;
                    if (!(e instanceof C20010a)) {
                        throw e;
                    }
                    if (c0326m.f1139a) {
                        throw e;
                    }
                    iOException = e;
                    if (c17326cM963x == null) {
                        c17326c = c17326cM963x;
                        c17326c.f55160a = c17358y;
                        c17326c.f55164e = c18795k.f59742e;
                        c17326c.f55170k = jCurrentTimeMillis;
                        iOException2 = iOException;
                        c17326c.f55171l = System.currentTimeMillis();
                        c17327dM18984a = c17326c.m18984a();
                        i10 = c17327dM18984a.f55176p0;
                        if (i10 != 100) {
                            C17326C c17326cM963x18 = c0326m.m963x(false);
                            AbstractC16544l.m18091d(c17326cM963x18);
                            if (z11) {
                                AbstractC16544l.m18094g(call, "call");
                            }
                            c17326cM963x18.f55160a = c17358y;
                            c17326cM963x18.f55164e = c18795k.f59742e;
                            c17326cM963x18.f55170k = jCurrentTimeMillis;
                            c17326cM963x18.f55171l = System.currentTimeMillis();
                            c17327dM18984a = c17326cM963x18.m18984a();
                            i10 = c17327dM18984a.f55176p0;
                        } else {
                            C17326C c17326cM963x19 = c0326m.m963x(false);
                            AbstractC16544l.m18091d(c17326cM963x19);
                            if (z11) {
                                AbstractC16544l.m18094g(call, "call");
                            }
                            c17326cM963x19.f55160a = c17358y;
                            c17326cM963x19.f55164e = c18795k.f59742e;
                            c17326cM963x19.f55170k = jCurrentTimeMillis;
                            c17326cM963x19.f55171l = System.currentTimeMillis();
                            c17327dM18984a = c17326cM963x19.m18984a();
                            i10 = c17327dM18984a.f55176p0;
                        }
                        AbstractC16544l.m18094g(call, "call");
                        if (this.f61049a) {
                            C17326C c17326cM18986e17 = c17327dM18984a.m18986e();
                            c17326cM18986e17.f55166g = c0326m.m960t(c17327dM18984a);
                            c17327dM18984a2 = c17326cM18986e17.m18984a();
                        } else {
                            C17326C c17326cM18986e18 = c17327dM18984a.m18986e();
                            c17326cM18986e18.f55166g = c0326m.m960t(c17327dM18984a);
                            c17327dM18984a2 = c17326cM18986e18.m18984a();
                        }
                        if ("close".equalsIgnoreCase(c17327dM18984a2.f55173Y.f55381c.m19012f("Connection"))) {
                            interfaceC19259c.getConnection().m20080l();
                        } else {
                            strM19012f = c17327dM18984a2.f55178r0.m19012f("Connection");
                            if (strM19012f == null) {
                                strM19012f = null;
                            }
                            if ("close".equalsIgnoreCase(strM19012f)) {
                                interfaceC19259c.getConnection().m20080l();
                            }
                        }
                        if (i10 != 204) {
                            abstractC17329F = c17327dM18984a2.f55179s0;
                            if (abstractC17329F != null) {
                                jMo18989a = abstractC17329F.mo18989a();
                            } else {
                                jMo18989a = -1;
                            }
                            if (jMo18989a > 0) {
                                StringBuilder sb17 = new StringBuilder("HTTP ");
                                sb17.append(i10);
                                sb17.append(" had non-zero Content-Length: ");
                                abstractC17329F2 = c17327dM18984a2.f55179s0;
                                if (abstractC17329F2 != null) {
                                    lValueOf = Long.valueOf(abstractC17329F2.mo18989a());
                                } else {
                                    lValueOf = null;
                                }
                                sb17.append(lValueOf);
                                throw new ProtocolException(sb17.toString());
                            }
                        } else {
                            abstractC17329F = c17327dM18984a2.f55179s0;
                            if (abstractC17329F != null) {
                                jMo18989a = abstractC17329F.mo18989a();
                            } else {
                                jMo18989a = -1;
                            }
                            if (jMo18989a > 0) {
                                StringBuilder sb18 = new StringBuilder("HTTP ");
                                sb18.append(i10);
                                sb18.append(" had non-zero Content-Length: ");
                                abstractC17329F2 = c17327dM18984a2.f55179s0;
                                if (abstractC17329F2 != null) {
                                    lValueOf = Long.valueOf(abstractC17329F2.mo18989a());
                                } else {
                                    lValueOf = null;
                                }
                                sb18.append(lValueOf);
                                throw new ProtocolException(sb18.toString());
                            }
                        }
                        return c17327dM18984a2;
                    }
                    c17326cM963x = c0326m.m963x(false);
                    AbstractC16544l.m18091d(c17326cM963x);
                    if (z11) {
                        AbstractC16544l.m18094g(call, "call");
                        c17326c = c17326cM963x;
                        z11 = false;
                    } else {
                        c17326c = c17326cM963x;
                    }
                    c17326c.f55160a = c17358y;
                    c17326c.f55164e = c18795k.f59742e;
                    c17326c.f55170k = jCurrentTimeMillis;
                    iOException2 = iOException;
                    c17326c.f55171l = System.currentTimeMillis();
                    c17327dM18984a = c17326c.m18984a();
                    i10 = c17327dM18984a.f55176p0;
                    if (i10 != 100) {
                        C17326C c17326cM963x110 = c0326m.m963x(false);
                        AbstractC16544l.m18091d(c17326cM963x110);
                        if (z11) {
                            AbstractC16544l.m18094g(call, "call");
                        }
                        c17326cM963x110.f55160a = c17358y;
                        c17326cM963x110.f55164e = c18795k.f59742e;
                        c17326cM963x110.f55170k = jCurrentTimeMillis;
                        c17326cM963x110.f55171l = System.currentTimeMillis();
                        c17327dM18984a = c17326cM963x110.m18984a();
                        i10 = c17327dM18984a.f55176p0;
                    } else {
                        C17326C c17326cM963x111 = c0326m.m963x(false);
                        AbstractC16544l.m18091d(c17326cM963x111);
                        if (z11) {
                            AbstractC16544l.m18094g(call, "call");
                        }
                        c17326cM963x111.f55160a = c17358y;
                        c17326cM963x111.f55164e = c18795k.f59742e;
                        c17326cM963x111.f55170k = jCurrentTimeMillis;
                        c17326cM963x111.f55171l = System.currentTimeMillis();
                        c17327dM18984a = c17326cM963x111.m18984a();
                        i10 = c17327dM18984a.f55176p0;
                    }
                    AbstractC16544l.m18094g(call, "call");
                    if (this.f61049a) {
                        C17326C c17326cM18986e19 = c17327dM18984a.m18986e();
                        c17326cM18986e19.f55166g = c0326m.m960t(c17327dM18984a);
                        c17327dM18984a2 = c17326cM18986e19.m18984a();
                    } else {
                        C17326C c17326cM18986e110 = c17327dM18984a.m18986e();
                        c17326cM18986e110.f55166g = c0326m.m960t(c17327dM18984a);
                        c17327dM18984a2 = c17326cM18986e110.m18984a();
                    }
                    if ("close".equalsIgnoreCase(c17327dM18984a2.f55173Y.f55381c.m19012f("Connection"))) {
                        interfaceC19259c.getConnection().m20080l();
                    } else {
                        strM19012f = c17327dM18984a2.f55178r0.m19012f("Connection");
                        if (strM19012f == null) {
                            strM19012f = null;
                        }
                        if ("close".equalsIgnoreCase(strM19012f)) {
                            interfaceC19259c.getConnection().m20080l();
                        }
                    }
                    if (i10 != 204) {
                        abstractC17329F = c17327dM18984a2.f55179s0;
                        if (abstractC17329F != null) {
                            jMo18989a = abstractC17329F.mo18989a();
                        } else {
                            jMo18989a = -1;
                        }
                        if (jMo18989a > 0) {
                            StringBuilder sb19 = new StringBuilder("HTTP ");
                            sb19.append(i10);
                            sb19.append(" had non-zero Content-Length: ");
                            abstractC17329F2 = c17327dM18984a2.f55179s0;
                            if (abstractC17329F2 != null) {
                                lValueOf = Long.valueOf(abstractC17329F2.mo18989a());
                            } else {
                                lValueOf = null;
                            }
                            sb19.append(lValueOf);
                            throw new ProtocolException(sb19.toString());
                        }
                    } else {
                        abstractC17329F = c17327dM18984a2.f55179s0;
                        if (abstractC17329F != null) {
                            jMo18989a = abstractC17329F.mo18989a();
                        } else {
                            jMo18989a = -1;
                        }
                        if (jMo18989a > 0) {
                            StringBuilder sb110 = new StringBuilder("HTTP ");
                            sb110.append(i10);
                            sb110.append(" had non-zero Content-Length: ");
                            abstractC17329F2 = c17327dM18984a2.f55179s0;
                            if (abstractC17329F2 != null) {
                                lValueOf = Long.valueOf(abstractC17329F2.mo18989a());
                            } else {
                                lValueOf = null;
                            }
                            sb110.append(lValueOf);
                            throw new ProtocolException(sb110.toString());
                        }
                    }
                    return c17327dM18984a2;
                    if (iOException2 == null) {
                        throw e;
                    }
                    IOException iOException8 = iOException2;
                    AbstractC9221V.m9789a(iOException8, e);
                    throw iOException8;
                }
            } catch (IOException e22) {
                AbstractC16544l.m18094g(call, "call");
                c0326m.m964y(e22);
                throw e22;
            }
        } catch (IOException e23) {
            e = e23;
        }
    }
}
