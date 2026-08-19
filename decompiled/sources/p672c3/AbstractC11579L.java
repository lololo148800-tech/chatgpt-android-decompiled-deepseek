package p672c3;

import android.content.Context;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC15256t;
import java.util.concurrent.CancellationException;
import mm.C17296C;
import p1081wc.C20863I;
import p523V9.AbstractC8038Z3;
import p523V9.AbstractC8223w5;
import p571X9.AbstractC9233X;
import p823j3.AbstractC16097s;
import p823j3.C16096r;
import p845k3.C16329f;
import p845k3.C16331h;
import p909nm.C17690x;
import p996rm.EnumC19250a;
import ph.C18417e;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: c3.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11579L {

    /* JADX INFO: renamed from: a */
    public final int f35020a = R.layout.glance_error_layout;

    /* JADX INFO: renamed from: b */
    public final C16096r f35021b = AbstractC16097s.f49862a;

    /* JADX INFO: renamed from: c */
    public final C16331h f35022c = C16331h.f50662a;

    /* JADX WARN: Code duplicated, block: B:26:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:56:0x0107 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m12974a(Context context, int i10, AbstractC19687c abstractC19687c) throws Throwable {
        C11575H c11575h;
        AbstractC11579L abstractC11579L;
        Context context2;
        int i11;
        Throwable th2;
        C16331h c16331h;
        C16329f c16329f;
        String strM8392a;
        C16331h c16331h2;
        C16329f c16329f2;
        String strM8392a2;
        C16331h c16331h3;
        C16329f c16329f3;
        String strM8392a3;
        if (abstractC19687c instanceof C11575H) {
            c11575h = (C11575H) abstractC19687c;
            int i12 = c11575h.f35003r0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c11575h.f35003r0 = i12 - Integer.MIN_VALUE;
            } else {
                c11575h = new C11575H(this, abstractC19687c);
            }
        } else {
            c11575h = new C11575H(this, abstractC19687c);
        }
        Object obj = c11575h.f35001p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i13 = c11575h.f35003r0;
        C17296C c17296c = C17296C.f55119a;
        switch (i13) {
            case 0:
                AbstractC9233X.m9807c(obj);
                C11576I c11576i = new C11576I(new C11597c(i10), null);
                c11575h.f34998Y = this;
                c11575h.f34999Z = context;
                c11575h.f35000o0 = i10;
                c11575h.f35003r0 = 1;
                if (this.f35021b.m17652a(c11576i, c11575h) == enumC19250a) {
                    return enumC19250a;
                }
                abstractC11579L = this;
                try {
                    c11575h.f34998Y = abstractC11579L;
                    c11575h.f34999Z = context;
                    c11575h.f35000o0 = i10;
                    c11575h.f35003r0 = 2;
                    ((C18417e) abstractC11579L).getClass();
                    AbstractC8223w5.m8851c().mo21447a(C20863I.f66420e, C17690x.f56481Y);
                    if (c17296c == enumC19250a) {
                        return enumC19250a;
                    }
                    int i14 = i10;
                    context2 = context;
                    i11 = i14;
                    c16331h3 = abstractC11579L.f35022c;
                    if (c16331h3 != null) {
                        c16329f3 = C16329f.f50659a;
                        strM8392a3 = AbstractC8038Z3.m8392a(i11);
                        c11575h.f34998Y = null;
                        c11575h.f34999Z = null;
                        c11575h.f35003r0 = 3;
                        if (c16329f3.m17919a(context2, c16331h3, strM8392a3, c11575h) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                    return c17296c;
                } catch (CancellationException unused) {
                    int i15 = i10;
                    context2 = context;
                    i11 = i15;
                    c16331h2 = abstractC11579L.f35022c;
                    if (c16331h2 != null) {
                        c16329f2 = C16329f.f50659a;
                        strM8392a2 = AbstractC8038Z3.m8392a(i11);
                        c11575h.f34998Y = null;
                        c11575h.f34999Z = null;
                        c11575h.f35003r0 = 4;
                        if (c16329f2.m17919a(context2, c16331h2, strM8392a2, c11575h) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    int i16 = i10;
                    context2 = context;
                    i11 = i16;
                    try {
                        AbstractC15256t.m16466d("GlanceAppWidget", "Error in user-provided deletion callback", th);
                        c16331h = abstractC11579L.f35022c;
                        if (c16331h != null) {
                            c16329f = C16329f.f50659a;
                            strM8392a = AbstractC8038Z3.m8392a(i11);
                            c11575h.f34998Y = null;
                            c11575h.f34999Z = null;
                            c11575h.f35003r0 = 5;
                            if (c16329f.m17919a(context2, c16331h, strM8392a, c11575h) == enumC19250a) {
                                return enumC19250a;
                            }
                        }
                    } catch (Throwable th4) {
                        C16331h c16331h4 = abstractC11579L.f35022c;
                        if (c16331h4 == null) {
                            throw th4;
                        }
                        C16329f c16329f4 = C16329f.f50659a;
                        String strM8392a4 = AbstractC8038Z3.m8392a(i11);
                        c11575h.f34998Y = th4;
                        c11575h.f34999Z = null;
                        c11575h.f35003r0 = 6;
                        if (c16329f4.m17919a(context2, c16331h4, strM8392a4, c11575h) == enumC19250a) {
                            return enumC19250a;
                        }
                        th2 = th4;
                    }
                }
                break;
                break;
            case 1:
                i10 = c11575h.f35000o0;
                context = c11575h.f34999Z;
                abstractC11579L = (AbstractC11579L) c11575h.f34998Y;
                AbstractC9233X.m9807c(obj);
                c11575h.f34998Y = abstractC11579L;
                c11575h.f34999Z = context;
                c11575h.f35000o0 = i10;
                c11575h.f35003r0 = 2;
                ((C18417e) abstractC11579L).getClass();
                AbstractC8223w5.m8851c().mo21447a(C20863I.f66420e, C17690x.f56481Y);
                if (c17296c == enumC19250a) {
                    return enumC19250a;
                }
                int i17 = i10;
                context2 = context;
                i11 = i17;
                c16331h3 = abstractC11579L.f35022c;
                if (c16331h3 != null) {
                    c16329f3 = C16329f.f50659a;
                    strM8392a3 = AbstractC8038Z3.m8392a(i11);
                    c11575h.f34998Y = null;
                    c11575h.f34999Z = null;
                    c11575h.f35003r0 = 3;
                    if (c16329f3.m17919a(context2, c16331h3, strM8392a3, c11575h) == enumC19250a) {
                        return enumC19250a;
                    }
                }
                return c17296c;
            case 2:
                i11 = c11575h.f35000o0;
                context2 = c11575h.f34999Z;
                abstractC11579L = (AbstractC11579L) c11575h.f34998Y;
                try {
                    AbstractC9233X.m9807c(obj);
                    c16331h3 = abstractC11579L.f35022c;
                    if (c16331h3 != null) {
                        c16329f3 = C16329f.f50659a;
                        strM8392a3 = AbstractC8038Z3.m8392a(i11);
                        c11575h.f34998Y = null;
                        c11575h.f34999Z = null;
                        c11575h.f35003r0 = 3;
                        if (c16329f3.m17919a(context2, c16331h3, strM8392a3, c11575h) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                } catch (CancellationException unused2) {
                    c16331h2 = abstractC11579L.f35022c;
                    if (c16331h2 != null) {
                        c16329f2 = C16329f.f50659a;
                        strM8392a2 = AbstractC8038Z3.m8392a(i11);
                        c11575h.f34998Y = null;
                        c11575h.f34999Z = null;
                        c11575h.f35003r0 = 4;
                        if (c16329f2.m17919a(context2, c16331h2, strM8392a2, c11575h) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    AbstractC15256t.m16466d("GlanceAppWidget", "Error in user-provided deletion callback", th);
                    c16331h = abstractC11579L.f35022c;
                    if (c16331h != null) {
                        c16329f = C16329f.f50659a;
                        strM8392a = AbstractC8038Z3.m8392a(i11);
                        c11575h.f34998Y = null;
                        c11575h.f34999Z = null;
                        c11575h.f35003r0 = 5;
                        if (c16329f.m17919a(context2, c16331h, strM8392a, c11575h) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                }
                return c17296c;
            case 3:
            case 4:
            case 5:
                AbstractC9233X.m9807c(obj);
                return c17296c;
            case 6:
                th2 = (Throwable) c11575h.f34998Y;
                AbstractC9233X.m9807c(obj);
                throw th2;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo12975b(Context context, AbstractC19687c abstractC19687c);
}
