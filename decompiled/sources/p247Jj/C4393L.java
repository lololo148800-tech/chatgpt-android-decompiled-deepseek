package p247Jj;

import android.os.Bundle;
import android.os.Parcel;
import androidx.fragment.app.AbstractC11002c;
import ck.C11765b;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p022Ak.C0540a;
import p022Ak.C0541b;
import p022Ak.C0542c;
import p022Ak.C0545f;
import p022Ak.C0547h;
import p022Ak.C0550k;
import p022Ak.C0551l;
import p022Ak.C0552m;
import p022Ak.C0553n;
import p022Ak.EnumC0544e;
import p022Ak.EnumC0546g;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p100Dk.AbstractC2082i;
import p100Dk.C2095v;
import p1044uj.AbstractC20340i;
import p1044uj.C20336g;
import p1044uj.C20338h;
import p1087wj.C20972C;
import p1113xn.AbstractC21322p;
import p1156zj.C22090C;
import p1156zj.C22106K;
import p1156zj.C22205x;
import p1156zj.InterfaceC22096F;
import p149Fj.C2882p;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p523V9.AbstractC8078e4;
import p544W9.AbstractC8751z2;
import p571X9.AbstractC9233X;
import p588Y2.C9605I;
import p594Y9.AbstractC9985v4;
import p647ak.AbstractC10729t;
import p770gk.C14187c;
import p770gk.InterfaceC14188d;
import p909nm.AbstractC17682p;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Jj.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C4393L extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f14276Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4399O f14277Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4456t f14278o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4393L(C4399O c4399o, C4456t c4456t, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f14277Z = c4399o;
        this.f14278o0 = c4456t;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4393L(this.f14277Z, this.f14278o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4393L) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:161:0x02d7 A[SYNTHETIC] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objMo2514c;
        String str;
        Iterator it;
        Object c0550k;
        C0542c c0542c;
        C0541b c0541b;
        Date date;
        EnumC0546g enumC0546g;
        Iterator it2;
        EnumC0544e enumC0544e;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f14276Y;
        C4399O c4399o = this.f14277Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InquiryViewModel inquiryViewModelM5185R = c4399o.m5185R();
            this.f14276Y = 1;
            objMo2514c = inquiryViewModelM5185R.f40711e.mo2514c(this);
            if (objMo2514c == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            objMo2514c = obj;
        }
        InterfaceC4441l0 interfaceC4441l0 = (InterfaceC4441l0) objMo2514c;
        String strMo5201e = interfaceC4441l0.mo5201e();
        C4456t c4456t = this.f14278o0;
        if (strMo5201e != null) {
            C4466y c4466y = (C4466y) c4456t.f14581z0.get();
            c4466y.getClass();
            C3516e c3516e = AbstractC0593T.f1824a;
            AbstractC0575H.m1156D(c4466y.f14607d, ExecutorC3515d.f10633Z, null, new C4462w(c4466y, strMo5201e, null), 2);
        }
        if (interfaceC4441l0 instanceof C4437j0) {
            String strM5171b = c4399o.m5184Q().m5171b();
            Bundle bundle = new Bundle();
            EnumC4410U enumC4410U = EnumC4410U.f14309Y;
            bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_COMPLETE");
            C4437j0 c4437j0 = (C4437j0) interfaceC4441l0;
            bundle.putString("INQUIRY_ID_KEY", c4437j0.f14447Y);
            bundle.putString("INQUIRY_STATUS_KEY", c4437j0.f14448Z);
            bundle.putParcelable("FIELDS_MAP_KEY", new C4389J(c4437j0.f14449o0));
            C14187c c14187c = c4399o.m5185R().f40712f;
            c14187c.getClass();
            ArrayList arrayList = new ArrayList(c14187c.f44581b);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                InterfaceC14188d interfaceC14188d = (InterfaceC14188d) it3.next();
                AbstractC16544l.m18094g(interfaceC14188d, "<this>");
                if (interfaceC14188d instanceof C2095v) {
                    C2095v c2095v = (C2095v) interfaceC14188d;
                    Parcel parcelObtain = Parcel.obtain();
                    AbstractC16544l.m18093f(parcelObtain, "obtain(...)");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : c2095v.f6443Z.entrySet()) {
                        String str2 = (String) entry.getKey();
                        try {
                            Object objM8498e = AbstractC8078e4.m8498e((AbstractC2082i) entry.getValue());
                            parcelObtain.writeValue(objM8498e);
                            linkedHashMap.put(str2, objM8498e);
                        } catch (RuntimeException unused) {
                        }
                    }
                    parcelObtain.recycle();
                    c0550k = new C0553n(c2095v.f6442Y, linkedHashMap);
                } else {
                    if (interfaceC14188d instanceof C11765b) {
                        C11765b c11765b = (C11765b) interfaceC14188d;
                        AbstractC10729t abstractC10729t = c11765b.f35684Z;
                        c0550k = new C0552m(c11765b.f35683Y, abstractC10729t != null ? AbstractC8751z2.m9507d(abstractC10729t) : null, abstractC10729t != null ? AbstractC8751z2.m9507d(abstractC10729t) : null, abstractC10729t != null ? AbstractC8751z2.m9507d(abstractC10729t) : null);
                    } else if (interfaceC14188d instanceof C2882p) {
                        C2882p c2882p = (C2882p) interfaceC14188d;
                        List list = c2882p.f8665Z;
                        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(list, 10));
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            InterfaceC22096F interfaceC22096F = (InterfaceC22096F) it4.next();
                            String strMo22350m = interfaceC22096F.mo22350m();
                            int iOrdinal = interfaceC22096F.mo22351v0().ordinal();
                            if (iOrdinal == 0) {
                                enumC0546g = EnumC0546g.f1740Y;
                            } else if (iOrdinal == 1) {
                                enumC0546g = EnumC0546g.f1741Z;
                            } else {
                                if (iOrdinal != 2) {
                                    throw new C0644w();
                                }
                                enumC0546g = EnumC0546g.f1742o0;
                            }
                            int iOrdinal2 = interfaceC22096F.mo22348P().ordinal();
                            if (iOrdinal2 != 0) {
                                it2 = it3;
                                if (iOrdinal2 == 1) {
                                    enumC0544e = EnumC0544e.f1734Y;
                                } else {
                                    if (iOrdinal2 != 2) {
                                        throw new C0644w();
                                    }
                                    enumC0544e = EnumC0544e.f1736o0;
                                }
                            } else {
                                it2 = it3;
                                enumC0544e = EnumC0544e.f1735Z;
                            }
                            List listMo22349j0 = interfaceC22096F.mo22349j0();
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it5 = listMo22349j0.iterator();
                            while (it5.hasNext()) {
                                Iterator it6 = it5;
                                C22205x c22205x = (C22205x) it5.next();
                                Iterator it7 = it4;
                                String str3 = strM5171b;
                                File file = new File(c22205x.f70393Y);
                                C0545f c0545f = file.exists() ? new C0545f(file, c22205x.f70394Z) : null;
                                if (c0545f != null) {
                                    arrayList4.add(c0545f);
                                }
                                it4 = it7;
                                it5 = it6;
                                strM5171b = str3;
                            }
                            arrayList3.add(new C0547h(strMo22350m, enumC0546g, enumC0544e, arrayList4));
                            it3 = it2;
                            it4 = it4;
                            strM5171b = strM5171b;
                        }
                        str = strM5171b;
                        it = it3;
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj2 : list) {
                            if (obj2 instanceof C22090C) {
                                arrayList5.add(obj2);
                            }
                        }
                        ArrayList arrayList6 = new ArrayList(AbstractC17682p.m19389r(arrayList5, 10));
                        Iterator it8 = arrayList5.iterator();
                        while (it8.hasNext()) {
                            arrayList6.add(((C22090C) it8.next()).f69827r0);
                        }
                        Iterator it9 = arrayList6.iterator();
                        while (true) {
                            if (!it9.hasNext()) {
                                c0541b = new C0541b(null, null);
                                break;
                            }
                            C22106K c22106k = (C22106K) it9.next();
                            if ((c22106k != null ? c22106k.f69873Y : null) != null && (date = c22106k.f69874Z) != null) {
                                c0541b = new C0541b(c22106k.f69873Y, date);
                                break;
                            }
                        }
                        c0550k = new C0551l(c2882p.f8664Y, arrayList3, c0541b);
                    } else {
                        str = strM5171b;
                        it = it3;
                        if (interfaceC14188d instanceof C20972C) {
                            C20972C c20972c = (C20972C) interfaceC14188d;
                            List<AbstractC20340i> list2 = c20972c.f66784Z;
                            ArrayList arrayList7 = new ArrayList();
                            for (AbstractC20340i abstractC20340i : list2) {
                                if (abstractC20340i instanceof C20336g) {
                                    c0542c = new C0542c(new File(((C20336g) abstractC20340i).f64301Y));
                                } else {
                                    if (!(abstractC20340i instanceof C20338h)) {
                                        throw new C0644w();
                                    }
                                    String str4 = ((C20338h) abstractC20340i).f64306Y;
                                    c0542c = str4 != null ? new C0542c(new File(str4)) : null;
                                }
                                if (c0542c != null) {
                                    arrayList7.add(c0542c);
                                }
                            }
                            c0550k = new C0550k(c20972c.f66783Y, arrayList7);
                        } else {
                            c0550k = null;
                        }
                    }
                    if (c0550k != null) {
                        arrayList2.add(c0550k);
                    }
                    it3 = it;
                    strM5171b = str;
                }
                str = strM5171b;
                it = it3;
                if (c0550k != null) {
                    arrayList2.add(c0550k);
                }
                it3 = it;
                strM5171b = str;
            }
            String str5 = strM5171b;
            bundle.putParcelable("COLLECTED_DATA", arrayList2.isEmpty() ? null : new C0540a(arrayList2));
            String strMo5201e2 = interfaceC4441l0.mo5201e();
            bundle.putString("SESSION_TOKEN_KEY", strMo5201e2 != null ? AbstractC21322p.m21702j0(strMo5201e2, "Bearer ") : null);
            AbstractC9985v4.m10628e(c4399o, str5, bundle);
        } else if (interfaceC4441l0 instanceof C4435i0) {
            String strMo5201e3 = interfaceC4441l0.mo5201e();
            if (strMo5201e3 != null) {
                C4466y c4466y2 = (C4466y) c4456t.f14581z0.get();
                c4466y2.getClass();
                C3516e c3516e2 = AbstractC0593T.f1824a;
                AbstractC0575H.m1156D(c4466y2.f14607d, ExecutorC3515d.f10633Z, null, new C4464x(c4466y2, strMo5201e3, null), 2);
            }
            String strM5171b2 = c4399o.m5184Q().m5171b();
            Bundle bundle2 = new Bundle();
            EnumC4410U enumC4410U2 = EnumC4410U.f14309Y;
            bundle2.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_CANCELED");
            bundle2.putString("INQUIRY_ID_KEY", ((C4435i0) interfaceC4441l0).f14437Y);
            String strMo5201e4 = interfaceC4441l0.mo5201e();
            bundle2.putString("SESSION_TOKEN_KEY", strMo5201e4 != null ? AbstractC21322p.m21702j0(strMo5201e4, "Bearer ") : null);
            AbstractC9985v4.m10628e(c4399o, strM5171b2, bundle2);
        } else if (interfaceC4441l0 instanceof C4439k0) {
            String strMo5201e5 = interfaceC4441l0.mo5201e();
            if (strMo5201e5 != null) {
                C4466y c4466y3 = (C4466y) c4456t.f14581z0.get();
                c4466y3.getClass();
                InternalErrorInfo errorInfo = ((C4439k0) interfaceC4441l0).f14453o0;
                AbstractC16544l.m18094g(errorInfo, "errorInfo");
                C3516e c3516e3 = AbstractC0593T.f1824a;
                AbstractC0575H.m1156D(c4466y3.f14607d, ExecutorC3515d.f10633Z, null, new C4460v(c4466y3, strMo5201e5, errorInfo, null), 2);
            }
            String strM5171b3 = c4399o.m5184Q().m5171b();
            Bundle bundle3 = new Bundle();
            EnumC4410U enumC4410U3 = EnumC4410U.f14309Y;
            bundle3.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
            C4439k0 c4439k0 = (C4439k0) interfaceC4441l0;
            bundle3.putString("ERROR_DEBUG_MESSAGE_KEY", c4439k0.f14451Y);
            bundle3.putParcelable("ERROR_CODE_KEY", c4439k0.f14452Z);
            AbstractC9985v4.m10628e(c4399o, strM5171b3, bundle3);
        }
        AbstractC11002c abstractC11002cM11754q = c4399o.m11754q();
        abstractC11002cM11754q.m11813w(new C9605I(abstractC11002cM11754q, -1, 0), false);
        return C17296C.f55119a;
    }
}
