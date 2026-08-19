package p143Fd;

import bo.C11527o;
import gd.C13853F0;
import gd.C13900V0;
import gd.C13927d0;
import gd.C14005w2;
import gd.InterfaceC13849E;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC16544l;
import p092Dc.C1991h;
import p168Gd.C3034b;
import p403Qd.AbstractC6653q0;
import p403Qd.C6615V;
import p403Qd.C6627d0;
import p479Td.AbstractC7343b0;
import p479Td.C7320F;
import p479Td.C7351f0;
import p479Td.EnumC7355h0;
import p479Td.EnumC7359j0;
import p575Xd.C9440I;
import p658b5.C11241l;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p929oi.AbstractC18201b;

/* JADX INFO: renamed from: Fd.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2713c extends C11241l {

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC13849E f8354o0;

    /* JADX INFO: renamed from: p0 */
    public List f8355p0;

    public C2713c(InterfaceC13849E interfaceC13849E) {
        super(4);
        this.f8354o0 = interfaceC13849E;
        this.f8355p0 = C17689w.f56480Y;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3  */
    @Override // p658b5.C11241l
    /* JADX INFO: renamed from: E */
    public final AbstractC6653q0 mo3703E(C1991h c1991h) {
        Object objPrevious;
        Object objPrevious2;
        C7351f0 c7351f0;
        int size;
        ArrayList arrayList = (ArrayList) this.f34016Y;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((C7351f0) objPrevious).f23290e.m7783a());
        C7351f0 c7351f1 = (C7351f0) objPrevious;
        ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
        do {
            if (!listIterator2.hasPrevious()) {
                objPrevious2 = null;
                break;
            }
            objPrevious2 = listIterator2.previous();
        } while (!((C7351f0) objPrevious2).f23293h.m7782a());
        C7351f0 c7351f2 = (C7351f0) objPrevious2;
        C3034b c3034bM3704Q = m3704Q(c7351f1);
        if (c3034bM3704Q == null && (c3034bM3704Q = m3704Q(c7351f2)) == null) {
            if (c7351f2 != null && (size = this.f8355p0.size() - 1) >= 0) {
                while (true) {
                    int i10 = size - 1;
                    c3034bM3704Q = m3704Q((C7351f0) this.f8355p0.get(size));
                    if (c3034bM3704Q != null) {
                        break;
                    }
                    if (i10 < 0) {
                        c3034bM3704Q = null;
                        break;
                    }
                    size = i10;
                }
            } else {
                c3034bM3704Q = null;
                break;
            }
        }
        boolean z6 = false;
        if (c7351f1 != null && c7351f1.f23280P && c3034bM3704Q == null) {
            return new C6627d0((String) null, false, 7);
        }
        if ((c7351f2 != null ? c7351f2.f23293h : null) == EnumC7355h0.f23330x0) {
            c7351f0 = (C7351f0) AbstractC17680n.m19353c0(arrayList);
            if (c7351f0 != null && c7351f0.f23275K) {
                if (((C14005w2) this.f8354o0).m15481a(C13927d0.f43977c)) {
                    z6 = true;
                }
            }
        } else {
            if ((c7351f1 != null ? c7351f1.f23290e : null) == EnumC7359j0.f23352w0) {
                c7351f0 = (C7351f0) AbstractC17680n.m19353c0(arrayList);
                if (c7351f0 != null) {
                    if (((C14005w2) this.f8354o0).m15481a(C13927d0.f43977c)) {
                        z6 = true;
                    }
                }
            }
        }
        return new C6615V(c3034bM3704Q, z6);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: Q */
    public final C3034b m3704Q(C7351f0 c7351f0) {
        boolean zM7783a;
        C9440I c9440i;
        C3034b c3034b;
        AbstractC7343b0 abstractC7343b0;
        C7320F c7320f;
        String str;
        C3034b c3034b2 = null;
        if (c7351f0 == null) {
            return null;
        }
        if (c7351f0.f23293h == EnumC7355h0.f23330x0) {
            C13853F0 c13853f0 = C13853F0.f43890c;
            C14005w2 c14005w2 = (C14005w2) this.f8354o0;
            if (c14005w2.m15481a(c13853f0) || c14005w2.m15481a(C13900V0.f43949c)) {
                String value = "temp-td-" + c7351f0.f23286a;
                AbstractC16544l.m18094g(value, "value");
                c3034b = new C3034b(value, null, null);
            } else {
                zM7783a = c7351f0.f23290e.m7783a();
                c9440i = c7351f0.f23300o;
                if (zM7783a) {
                    if (c9440i != null) {
                        return c9440i.f28440k;
                    }
                    return null;
                }
                if (c9440i != null) {
                    c3034b = c9440i.f28440k;
                } else {
                    c3034b = null;
                }
                abstractC7343b0 = c7351f0.f23291f;
                if (!(abstractC7343b0 instanceof C7320F)) {
                    abstractC7343b0 = null;
                }
                c7320f = (C7320F) abstractC7343b0;
                if (c7320f != null) {
                    str = c7320f.f23219c;
                } else {
                    str = null;
                }
                try {
                    C11527o c11527o = AbstractC18201b.f58034a;
                    if (str == null) {
                        str = "";
                    }
                    c11527o.getClass();
                    c3034b2 = (C3034b) c11527o.m12903b(str, C3034b.Companion.serializer());
                } catch (Throwable unused) {
                }
                if (c3034b == null && c3034b2 != null) {
                    String str2 = c3034b.f9129b;
                    if (str2 == null) {
                        str2 = c3034b2.f9129b;
                    }
                    Integer num = c3034b.f9130c;
                    if (num == null) {
                        num = c3034b2.f9130c;
                    }
                    String id2 = c3034b.f9128a;
                    AbstractC16544l.m18094g(id2, "id");
                    c3034b = new C3034b(id2, num, str2);
                } else if (c3034b == null) {
                    return c3034b2;
                }
            }
        } else {
            zM7783a = c7351f0.f23290e.m7783a();
            c9440i = c7351f0.f23300o;
            if (zM7783a) {
                if (c9440i != null) {
                    return c9440i.f28440k;
                }
                return null;
            }
            if (c9440i != null) {
                c3034b = c9440i.f28440k;
            } else {
                c3034b = null;
            }
            abstractC7343b0 = c7351f0.f23291f;
            if (!(abstractC7343b0 instanceof C7320F)) {
                abstractC7343b0 = null;
            }
            c7320f = (C7320F) abstractC7343b0;
            if (c7320f != null) {
                str = c7320f.f23219c;
            } else {
                str = null;
            }
            C11527o c11527o2 = AbstractC18201b.f58034a;
            if (str == null) {
                str = "";
            }
            c11527o2.getClass();
            c3034b2 = (C3034b) c11527o2.m12903b(str, C3034b.Companion.serializer());
            if (c3034b == null) {
                if (c3034b == null) {
                    return c3034b2;
                }
            } else if (c3034b == null) {
                return c3034b2;
            }
        }
        return c3034b;
    }
}
