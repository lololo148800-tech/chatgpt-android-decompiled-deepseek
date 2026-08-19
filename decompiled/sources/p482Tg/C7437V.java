package p482Tg;

import android.content.Context;
import com.openai.auth.SwitchAccountViewModel;
import com.openai.feature.settings.impl.settings.SettingsViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p001A.AbstractC0010F;
import p020Ai.C0515d;
import p025An.C0644w;
import p042Bf.C1281w;
import p049Bm.InterfaceC1436k;
import p087D7.AbstractC1976c;
import p1113xn.AbstractC21322p;
import p1155zi.C21891A;
import p1155zi.C22013h2;
import p1155zi.EnumC21895B;
import p225Im.InterfaceC3759g;
import p349O0.InterfaceC5985X;
import p499U9.C7591u;
import p523V9.AbstractC8111i5;
import p537W0.C8410b;
import p553Wh.C8870f;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9393x3;
import p635a1.InterfaceC10459q;
import p662b8.C11260d;
import p676c7.C11682a;
import p676c7.C11683b;
import p676c7.C11688g;
import p677c8.C11689a;
import p722e8.C13315Z;
import p722e8.C13326j;
import p775h2.AbstractC14376f;
import p827j7.C16175c;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17682p;
import p911o0.AbstractC17792x;
import p919o8.C17900H;
import p919o8.C17903I;
import p919o8.C17918N;
import p919o8.C17921O;
import p919o8.C17932S;
import p919o8.C17935T;
import p919o8.C17938U;
import p919o8.C17941V;
import p919o8.C17947X;
import p919o8.C17949Y;
import p919o8.C17951Z;
import p919o8.C17960c0;
import p919o8.C17972g0;
import p919o8.C17975h0;
import p919o8.C17978i0;
import p919o8.C17984k0;
import p936p0.C18265e;

/* JADX INFO: renamed from: Tg.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C7437V extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23520Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f23521Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f23522o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f23523p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f23524q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f23525r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f23526s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Object f23527t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ Object f23528u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ Object f23529v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7437V(InterfaceC3759g interfaceC3759g, InterfaceC5985X interfaceC5985X, C7439X c7439x, C8870f c8870f, InterfaceC10459q interfaceC10459q, Context context, SwitchAccountViewModel switchAccountViewModel, SettingsViewModel settingsViewModel, boolean z6) {
        super(1);
        this.f23522o0 = c7439x;
        this.f23523p0 = c8870f;
        this.f23521Z = z6;
        this.f23524q0 = switchAccountViewModel;
        this.f23525r0 = context;
        this.f23526s0 = interfaceC3759g;
        this.f23527t0 = interfaceC10459q;
        this.f23528u0 = settingsViewModel;
        this.f23529v0 = interfaceC5985X;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00b7  */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        String strM3148e;
        int i10;
        int i11;
        C17978i0 c17978i0;
        int i12;
        int i13;
        String str;
        switch (this.f23520Y) {
            case 0:
                C18265e LazyColumn = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn, "$this$LazyColumn");
                C7439X c7439x = (C7439X) this.f23522o0;
                C0515d c0515d = c7439x.f23541b;
                Context context = (Context) this.f23525r0;
                if (c0515d != null) {
                    AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C1281w(c7439x, (SwitchAccountViewModel) this.f23524q0, context, 10), true, -1968566786), 3);
                }
                EnumC21895B enumC21895B = ((C8870f) this.f23523p0).f27148a;
                EnumC21895B enumC21895B2 = EnumC21895B.f69419Z;
                InterfaceC3759g interfaceC3759g = (InterfaceC3759g) this.f23526s0;
                if (enumC21895B != enumC21895B2) {
                    AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C7442a(interfaceC3759g, 6), true, -1066302229), 3);
                    AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C7442a(interfaceC3759g, 7), true, 681318420), 3);
                }
                C21891A c21891a = c7439x.f23540a;
                if (c21891a != null) {
                    C22013h2 c22013h2 = c21891a.f69416b;
                    String str2 = c22013h2.f69656b;
                    InterfaceC10459q interfaceC10459q = (InterfaceC10459q) this.f23527t0;
                    if (str2 != null) {
                        AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C7446c(interfaceC10459q, str2, 2), true, 965081500), 3);
                    }
                    String str3 = c22013h2.f69657c;
                    if (str3 != null) {
                        AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C7446c(interfaceC10459q, str3, 3), true, 1051838597), 3);
                    }
                    AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C7447d(c7439x, interfaceC3759g, 4), true, -1204914052), 3);
                    AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C7447d(c7439x, interfaceC3759g, 5), true, -1254748315), 3);
                }
                AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C7442a(interfaceC3759g, 8), true, -452803802), 3);
                AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C7442a(interfaceC3759g, 9), true, 279610767), 3);
                if (this.f23521Z) {
                    AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C7442a(interfaceC3759g, 10), true, -881858028), 3);
                }
                AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C7442a(interfaceC3759g, 11), true, -608426770), 3);
                AbstractC17792x.m19528k(LazyColumn, null, AbstractC7459p.f23696r, 3);
                AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C7442a(interfaceC3759g, 12), true, 1910465452), 3);
                AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C1281w((SettingsViewModel) this.f23528u0, context, (InterfaceC5985X) this.f23529v0, 11), true, 1022427915), 3);
                AbstractC17792x.m19528k(LazyColumn, null, AbstractC7459p.f23701w, 3);
                return C17296C.f55119a;
            default:
                C11682a datadogContext = (C11682a) obj;
                AbstractC16544l.m18094g(datadogContext, "datadogContext");
                C13315Z c13315z = (C13315Z) this.f23522o0;
                C7591u c7591u = c13315z.f42191j;
                C11689a c11689a = (C11689a) this.f23523p0;
                String str4 = c11689a.f35460d;
                String str5 = "";
                boolean zM7938M = C7591u.m7938M(datadogContext, str4 == null ? "" : str4);
                String str6 = c11689a.f35464h;
                C17972g0 c17972g0 = (str6 == null || AbstractC21322p.m21681O(str6) || (str = c11689a.f35465i) == null || AbstractC21322p.m21681O(str)) ? null : new C17972g0(str6, str, null);
                int i14 = c17972g0 == null ? 1 : 2;
                C13326j c13326j = (C13326j) this.f23524q0;
                long j10 = c13326j.f42284h.f35476a + c13315z.f42201t;
                C17932S c17932s = new C17932S((LinkedHashMap) this.f23525r0);
                int iM8600k = AbstractC8111i5.m8600k(c13326j.f42279c);
                Throwable th2 = c13326j.f42280d;
                String str7 = c13326j.f42281e;
                if (str7 == null) {
                    strM3148e = th2 != null ? AbstractC1976c.m3148e(th2) : null;
                } else {
                    strM3148e = str7;
                }
                int i15 = c13326j.f42286j;
                AbstractC14376f.m15825D(i15, "<this>");
                int iM24h = AbstractC0010F.m24h(i15);
                if (iM24h != 0) {
                    if (iM24h != 1) {
                        if (iM24h == 2) {
                            i13 = 4;
                        } else if (iM24h == 3) {
                            i13 = 5;
                        } else if (iM24h == 4) {
                            i12 = 7;
                        } else {
                            if (iM24h != 5) {
                                throw new C0644w();
                            }
                            i12 = 9;
                        }
                        i10 = i13;
                    } else {
                        i12 = 2;
                    }
                    i10 = i12;
                } else {
                    i10 = 1;
                }
                if (th2 != null) {
                    if (th2 instanceof C11260d) {
                        i11 = 1;
                    } else {
                        i11 = 3;
                    }
                } else if (str7 != null) {
                    i11 = 3;
                } else {
                    i11 = 0;
                }
                List list = c13326j.f42287k;
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C16175c c16175c = (C16175c) it.next();
                    arrayList.add(new C17975h0(c16175c.f50212a, c16175c.f50214c, c16175c.f50215d, c16175c.f50213b));
                    str5 = str5;
                    it = it;
                    c17932s = c17932s;
                }
                String str8 = str5;
                C17932S c17932s2 = c17932s;
                ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
                Long l4 = c13326j.f42288l;
                C17947X c17947x = new C17947X((String) this.f23526s0, iM8600k, strM3148e, Boolean.valueOf(this.f23521Z), (String) this.f23527t0, (String) this.f23528u0, i11, i10, null, arrayList2, l4 != null ? Long.valueOf(TimeUnit.NANOSECONDS.toMillis(l4.longValue())) : null, 120337);
                String str9 = c11689a.f35463g;
                C17900H c17900h = str9 != null ? new C17900H(AbstractC9393x3.m9974d(str9)) : null;
                String str10 = str4 == null ? str8 : str4;
                String str11 = c11689a.f35462f;
                C17951Z c17951z = new C17951Z(18, str10, (String) null, str11 == null ? str8 : str11, c11689a.f35461e);
                C11688g c11688g = datadogContext.f35421m;
                if (AbstractC9144I.m9689a(c11688g)) {
                    c17978i0 = new C17978i0(c11688g.f35452a, c11688g.f35453b, c11688g.f35454c, AbstractC17659D.m19256r(c11688g.f35455d));
                } else {
                    c17978i0 = null;
                }
                C17921O c17921oM8597h = AbstractC8111i5.m8597h(datadogContext.f35419k);
                C17903I c17903i = new C17903I(c11689a.f35457a);
                C17949Y c17949y = new C17949Y(i14, Boolean.valueOf(zM7938M), c11689a.f35458b);
                int iM8601l = AbstractC8111i5.m8601l(datadogContext.f35415g, c13315z.f42183b.mo15463s());
                C11683b c11683b = datadogContext.f35420l;
                return new C17984k0(j10, c17903i, datadogContext.f35411c, datadogContext.f35413e, datadogContext.f35423o, c17949y, iM8601l, c17951z, c17978i0, c17921oM8597h, c17972g0, new C17960c0(c11683b.f35430f, c11683b.f35432h, null, c11683b.f35431g), new C17941V(AbstractC8111i5.m8598i(c11683b.f35428d), c11683b.f35425a, c11683b.f35427c, c11683b.f35426b, c11683b.f35433i), new C17935T(new C17938U(AbstractC8111i5.m8599j(c11689a.f35470n), 1), new C17918N(Float.valueOf(c13315z.f42193l)), null), new C17932S((LinkedHashMap) this.f23529v0), c17900h, c17947x, c17932s2, 534544);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7437V(C13315Z c13315z, C11689a c11689a, C13326j c13326j, LinkedHashMap linkedHashMap, String str, boolean z6, String str2, String str3, LinkedHashMap linkedHashMap2) {
        super(1);
        this.f23522o0 = c13315z;
        this.f23523p0 = c11689a;
        this.f23524q0 = c13326j;
        this.f23525r0 = linkedHashMap;
        this.f23526s0 = str;
        this.f23521Z = z6;
        this.f23527t0 = str2;
        this.f23528u0 = str3;
        this.f23529v0 = linkedHashMap2;
    }
}
