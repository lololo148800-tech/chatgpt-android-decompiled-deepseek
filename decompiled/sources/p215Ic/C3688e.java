package p215Ic;

import android.app.Application;
import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import bf.AbstractC11372a0;
import com.openai.chatgpt.R;
import gd.C13907X1;
import gd.C13948i1;
import gd.C13993t2;
import gd.C14005w2;
import gd.InterfaceC13849E;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import ni.C17627a;
import p025An.AbstractC0593T;
import p033B5.AbstractC0833q;
import p033B5.C0840x;
import p033B5.InterfaceC0829m;
import p033B5.InterfaceC0832p;
import p071Ch.C1676g;
import p082D2.AbstractC1854a;
import p092Dc.C1991h;
import p103Dn.AbstractC2124C;
import p1042uh.C20263a0;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21952P1;
import p201Hn.C3516e;
import p228J.AbstractC3794B0;
import p289Lc.C4994b;
import p318Mh.C5431w;
import p318Mh.EnumC5421r;
import p336Nc.C5706b;
import p374P5.C6351d;
import p374P5.C6354g;
import p374P5.C6363p;
import p374P5.InterfaceC6357j;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9393x3;
import p571X9.AbstractC9405z3;
import p576Xe.C9473F;
import p576Xe.C9478c;
import p578Xg.C9513a;
import p594Y9.AbstractC9827W2;
import p600Yg.C10059a;
import p600Yg.C10060b;
import p600Yg.C10061c;
import p658b5.C11242m;
import p811ih.C15000g;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p938p2.AbstractC18289c;
import p938p2.AbstractC18290d;
import p938p2.C18287a;
import p948pi.InterfaceC18419b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ic.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C3688e implements InterfaceC18419b {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f11191Y = 1;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC13849E f11192Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f11193o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f11194p0;

    /* JADX INFO: renamed from: q0 */
    public final Object f11195q0;

    /* JADX INFO: renamed from: r0 */
    public final Object f11196r0;

    /* JADX INFO: renamed from: s0 */
    public final Object f11197s0;

    public C3688e(C17627a scope, InterfaceC13849E experimentManager, C15000g accountUserProvider, C5706b datadogConfig, C4994b datadogLogger, C1676g devicePreferences) {
        AbstractC16544l.m18094g(scope, "scope");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(accountUserProvider, "accountUserProvider");
        AbstractC16544l.m18094g(datadogConfig, "datadogConfig");
        AbstractC16544l.m18094g(datadogLogger, "datadogLogger");
        AbstractC16544l.m18094g(devicePreferences, "devicePreferences");
        this.f11193o0 = scope;
        this.f11192Z = experimentManager;
        this.f11194p0 = accountUserProvider;
        this.f11195q0 = datadogConfig;
        this.f11196r0 = datadogLogger;
        this.f11197s0 = devicePreferences;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x025c  */
    /* JADX WARN: Code duplicated, block: B:105:0x028d A[Catch: all -> 0x02b1, Exception -> 0x02b3, TryCatch #0 {all -> 0x02b1, blocks: (B:103:0x027f, B:105:0x028d, B:106:0x0294, B:108:0x029a, B:110:0x02a5, B:111:0x02a9, B:115:0x02b5, B:117:0x02b8), top: B:152:0x027f }] */
    /* JADX WARN: Code duplicated, block: B:108:0x029a A[Catch: all -> 0x02b1, Exception -> 0x02b3, TryCatch #0 {all -> 0x02b1, blocks: (B:103:0x027f, B:105:0x028d, B:106:0x0294, B:108:0x029a, B:110:0x02a5, B:111:0x02a9, B:115:0x02b5, B:117:0x02b8), top: B:152:0x027f }] */
    /* JADX WARN: Code duplicated, block: B:123:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:158:0x0229 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x016b  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b2 A[LOOP:0: B:58:0x01ac->B:60:0x01b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x0214  */
    /* JADX WARN: Code duplicated, block: B:89:0x021c  */
    /* JADX WARN: Code duplicated, block: B:94:0x023d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x023f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011f, code lost:
    
        if (r0 == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0198, code lost:
    
        if (r0 == r8) goto L27;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0198 -> B:54:0x019c). Please report as a decompilation issue!!! */
    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1965a(InterfaceC18770c interfaceC18770c) {
        C10061c c10061c;
        C3688e c3688e;
        List list;
        List list2;
        C3688e c3688e2;
        Collection arrayList;
        AbstractC21955Q1 abstractC21955Q1;
        Iterator it;
        List<C18287a> list3;
        Application application;
        int i10;
        int maxShortcutCountPerActivity;
        ArrayList<C18287a> arrayList2;
        Iterator it2;
        byte b;
        String str;
        ShortcutManager shortcutManagerM2717f;
        List dynamicShortcuts;
        IconCompat iconCompat;
        int i11;
        InputStream inputStreamM11388f;
        Bitmap bitmapDecodeStream;
        IconCompat iconCompat2;
        Iterator it3;
        List list4;
        C17296C c17296c = C17296C.f55119a;
        Object obj = this.f11193o0;
        switch (this.f11191Y) {
            case 0:
                AbstractC2124C.m3226y(AbstractC2124C.m3227z(new C3687d(this, null), ((C15000g) this.f11194p0).f46691b), (C17627a) obj);
                return c17296c;
            default:
                if (interfaceC18770c instanceof C10061c) {
                    c10061c = (C10061c) interfaceC18770c;
                    int i12 = c10061c.f29801t0;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c10061c.f29801t0 = i12 - Integer.MIN_VALUE;
                    } else {
                        c10061c = new C10061c(this, (AbstractC19687c) interfaceC18770c);
                    }
                } else {
                    c10061c = new C10061c(this, (AbstractC19687c) interfaceC18770c);
                }
                Object objM15482b = c10061c.f29799r0;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i13 = c10061c.f29801t0;
                if (i13 == 0) {
                    AbstractC9233X.m9807c(objM15482b);
                    Application application2 = (Application) obj;
                    if (Build.VERSION.SDK_INT >= 25) {
                        AbstractC1854a.m2717f(application2.getSystemService(AbstractC1854a.m2718g())).removeAllDynamicShortcuts();
                    }
                    AbstractC18290d.m19833d(application2).getClass();
                    Iterator it4 = ((ArrayList) AbstractC18290d.m19832c(application2)).iterator();
                    if (it4.hasNext()) {
                        throw AbstractC3794B0.m4497v(it4);
                    }
                    C13948i1 c13948i1 = C13948i1.f44003c;
                    c10061c.f29794Y = this;
                    c10061c.f29801t0 = 1;
                    objM15482b = ((C14005w2) this.f11192Z).m15482b(c13948i1, c10061c);
                    if (objM15482b != enumC19250a) {
                        c3688e = this;
                    }
                    list4 = list2;
                    return enumC19250a;
                }
                if (i13 == 1) {
                    C3688e c3688e3 = c10061c.f29794Y;
                    AbstractC9233X.m9807c(objM15482b);
                    c3688e = c3688e3;
                } else {
                    if (i13 == 2) {
                        List list5 = c10061c.f29795Z;
                        c3688e = c10061c.f29794Y;
                        AbstractC9233X.m9807c(objM15482b);
                        list = list5;
                        AbstractC21955Q1 abstractC21955Q2 = (AbstractC21955Q1) objM15482b;
                        list3 = list;
                        if (abstractC21955Q2 instanceof C21952P1) {
                            List list6 = (List) ((C21952P1) abstractC21955Q2).f69511a;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : list6) {
                                if (AbstractC11372a0.m12783b((C20263a0) obj2)) {
                                    arrayList3.add(obj2);
                                }
                            }
                            List listM19373w0 = AbstractC17680n.m19373w0(arrayList3, 2);
                            list2 = list;
                            c3688e2 = c3688e;
                            arrayList = new ArrayList();
                            abstractC21955Q1 = abstractC21955Q2;
                            it = listM19373w0.iterator();
                            if (!it.hasNext()) {
                                C20263a0 c20263a0 = (C20263a0) it.next();
                                C9513a c9513a = new C9513a(AbstractC9393x3.m9974d(c20263a0.f64086c.f64081a));
                                Application application3 = (Application) c3688e2.f11193o0;
                                c10061c.f29794Y = c3688e2;
                                c10061c.f29795Z = list2;
                                c10061c.f29796o0 = abstractC21955Q1;
                                c10061c.f29797p0 = arrayList;
                                c10061c.f29798q0 = it;
                                c10061c.f29801t0 = 3;
                                objM15482b = c3688e2.m4398c(application3, c20263a0, c9513a, c10061c);
                            } else {
                                it3 = ((List) arrayList).iterator();
                                while (it3.hasNext()) {
                                    list2.add((C18287a) it3.next());
                                }
                                list3 = list2;
                                c3688e = c3688e2;
                            }
                            break;
                        }
                        for (C18287a c18287a : list3) {
                            application = (Application) c3688e.f11193o0;
                            c18287a.getClass();
                            i10 = Build.VERSION.SDK_INT;
                            if (i10 >= 25) {
                                maxShortcutCountPerActivity = AbstractC1854a.m2717f(application.getSystemService(AbstractC1854a.m2718g())).getMaxShortcutCountPerActivity();
                            } else {
                                maxShortcutCountPerActivity = 5;
                            }
                            if (maxShortcutCountPerActivity != 0) {
                                if (i10 <= 29 && (iconCompat = c18287a.f58381e) != null && (((i11 = iconCompat.f32891a) == 6 || i11 == 4) && (inputStreamM11388f = iconCompat.m11388f(application)) != null && (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamM11388f)) != null)) {
                                    if (i11 == 6) {
                                        iconCompat2 = new IconCompat(5);
                                        iconCompat2.f32892b = bitmapDecodeStream;
                                    } else {
                                        iconCompat2 = new IconCompat(1);
                                        iconCompat2.f32892b = bitmapDecodeStream;
                                    }
                                    c18287a.f58381e = iconCompat2;
                                }
                                if (i10 >= 30) {
                                    AbstractC1854a.m2717f(application.getSystemService(AbstractC1854a.m2718g())).pushDynamicShortcut(c18287a.m19829a());
                                } else if (i10 >= 25) {
                                    shortcutManagerM2717f = AbstractC1854a.m2717f(application.getSystemService(AbstractC1854a.m2718g()));
                                    if (shortcutManagerM2717f.isRateLimitingActive()) {
                                        dynamicShortcuts = shortcutManagerM2717f.getDynamicShortcuts();
                                        if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                                            shortcutManagerM2717f.removeDynamicShortcuts(Arrays.asList(AbstractC18289c.m19830a(dynamicShortcuts)));
                                        }
                                        shortcutManagerM2717f.addDynamicShortcuts(Arrays.asList(c18287a.m19829a()));
                                    }
                                }
                                try {
                                    try {
                                        AbstractC18290d.m19833d(application).getClass();
                                        arrayList2 = new ArrayList();
                                        if (arrayList2.size() >= maxShortcutCountPerActivity) {
                                            b = -1;
                                            str = null;
                                            for (C18287a c18287a2 : arrayList2) {
                                                c18287a2.getClass();
                                                if (b < 0) {
                                                    str = c18287a2.f58378b;
                                                    b = 0;
                                                }
                                            }
                                            Arrays.asList(str);
                                        }
                                        C18287a[] c18287aArr = new C18287a[1];
                                        try {
                                            c18287aArr[0] = c18287a;
                                            Arrays.asList(c18287aArr);
                                            it2 = ((ArrayList) AbstractC18290d.m19832c(application)).iterator();
                                            if (it2.hasNext()) {
                                                if (it2.next() == null) {
                                                    throw new ClassCastException();
                                                }
                                                Collections.singletonList(c18287a);
                                                throw null;
                                            }
                                        } catch (Exception unused) {
                                            Iterator it5 = ((ArrayList) AbstractC18290d.m19832c(application)).iterator();
                                            if (it5.hasNext()) {
                                                if (it5.next() != null) {
                                                    throw new ClassCastException();
                                                }
                                                Collections.singletonList(c18287a);
                                                throw null;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        Iterator it6 = ((ArrayList) AbstractC18290d.m19832c(application)).iterator();
                                        if (!it6.hasNext()) {
                                            AbstractC18290d.m19834f(application, c18287a.f58378b);
                                            throw th2;
                                        }
                                        if (it6.next() != null) {
                                            throw new ClassCastException();
                                        }
                                        Collections.singletonList(c18287a);
                                        throw null;
                                    }
                                } catch (Exception unused2) {
                                }
                                AbstractC18290d.m19834f(application, c18287a.f58378b);
                            }
                        }
                        return c17296c;
                    }
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = c10061c.f29798q0;
                    arrayList = c10061c.f29797p0;
                    abstractC21955Q1 = c10061c.f29796o0;
                    List list7 = c10061c.f29795Z;
                    c3688e2 = c10061c.f29794Y;
                    AbstractC9233X.m9807c(objM15482b);
                    list4 = list7;
                }
                list4 = list2;
                C18287a c18287a3 = (C18287a) objM15482b;
                list2 = list4;
                if (c18287a3 != null) {
                    arrayList.add(c18287a3);
                    list2 = list4;
                }
                if (!it.hasNext()) {
                    it3 = ((List) arrayList).iterator();
                    while (it3.hasNext()) {
                        list2.add((C18287a) it3.next());
                    }
                    list3 = list2;
                    c3688e = c3688e2;
                    while (r0.hasNext()) {
                        application = (Application) c3688e.f11193o0;
                        c18287a.getClass();
                        i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 25) {
                            maxShortcutCountPerActivity = AbstractC1854a.m2717f(application.getSystemService(AbstractC1854a.m2718g())).getMaxShortcutCountPerActivity();
                        } else {
                            maxShortcutCountPerActivity = 5;
                        }
                        if (maxShortcutCountPerActivity != 0) {
                            if (i10 <= 29) {
                                if (i11 == 6) {
                                    iconCompat2 = new IconCompat(5);
                                    iconCompat2.f32892b = bitmapDecodeStream;
                                } else {
                                    iconCompat2 = new IconCompat(1);
                                    iconCompat2.f32892b = bitmapDecodeStream;
                                }
                                c18287a.f58381e = iconCompat2;
                            }
                            if (i10 >= 30) {
                                AbstractC1854a.m2717f(application.getSystemService(AbstractC1854a.m2718g())).pushDynamicShortcut(c18287a.m19829a());
                            } else if (i10 >= 25) {
                                shortcutManagerM2717f = AbstractC1854a.m2717f(application.getSystemService(AbstractC1854a.m2718g()));
                                if (shortcutManagerM2717f.isRateLimitingActive()) {
                                    dynamicShortcuts = shortcutManagerM2717f.getDynamicShortcuts();
                                    if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                                        shortcutManagerM2717f.removeDynamicShortcuts(Arrays.asList(AbstractC18289c.m19830a(dynamicShortcuts)));
                                    }
                                    shortcutManagerM2717f.addDynamicShortcuts(Arrays.asList(c18287a.m19829a()));
                                }
                            }
                            AbstractC18290d.m19833d(application).getClass();
                            arrayList2 = new ArrayList();
                            if (arrayList2.size() >= maxShortcutCountPerActivity) {
                                b = -1;
                                str = null;
                                while (r5.hasNext()) {
                                    c18287a2.getClass();
                                    if (b < 0) {
                                        str = c18287a2.f58378b;
                                        b = 0;
                                    }
                                }
                                Arrays.asList(str);
                            }
                            C18287a[] c18287aArr2 = new C18287a[1];
                            c18287aArr2[0] = c18287a;
                            Arrays.asList(c18287aArr2);
                            it2 = ((ArrayList) AbstractC18290d.m19832c(application)).iterator();
                            if (it2.hasNext()) {
                                if (it2.next() == null) {
                                    throw new ClassCastException();
                                }
                                Collections.singletonList(c18287a);
                                throw null;
                            }
                            AbstractC18290d.m19834f(application, c18287a.f58378b);
                        }
                    }
                    return c17296c;
                }
                C20263a0 c20263a1 = (C20263a0) it.next();
                C9513a c9513a2 = new C9513a(AbstractC9393x3.m9974d(c20263a1.f64086c.f64081a));
                Application application4 = (Application) c3688e2.f11193o0;
                c10061c.f29794Y = c3688e2;
                c10061c.f29795Z = list2;
                c10061c.f29796o0 = abstractC21955Q1;
                c10061c.f29797p0 = arrayList;
                c10061c.f29798q0 = it;
                c10061c.f29801t0 = 3;
                objM15482b = c3688e2.m4398c(application4, c20263a1, c9513a2, c10061c);
                break;
                if (!((Boolean) objM15482b).booleanValue()) {
                    return c17296c;
                }
                ArrayList arrayList4 = new ArrayList();
                Application application5 = (Application) c3688e.f11193o0;
                EnumC5421r enumC5421r = EnumC5421r.f17710Z;
                C1991h c1991h = (C1991h) c3688e.f11195q0;
                C18287a c18287aM4399d = c3688e.m4399d(application5, enumC5421r, R.string.voice_shortcut, R.mipmap.ic_quick_tile_voice, new C9513a(AbstractC17678l.m19291N(c1991h.m3162d(R.array.vision_short_cut_trigger_words))));
                if (c18287aM4399d != null) {
                    arrayList4.add(c18287aM4399d);
                }
                C18287a c18287aM4399d2 = c3688e.m4399d((Application) c3688e.f11193o0, EnumC5421r.f17711o0, R.string.vision_shortcut, R.mipmap.ic_quick_tile_vision, new C9513a(AbstractC17678l.m19291N(c1991h.m3162d(R.array.voice_short_cut_trigger_words))));
                if (c18287aM4399d2 != null) {
                    arrayList4.add(c18287aM4399d2);
                }
                C9478c c9478cM10468a = AbstractC9827W2.m10468a((C9473F) c3688e.f11194p0, true, 1);
                c10061c.f29794Y = c3688e;
                c10061c.f29795Z = arrayList4;
                c10061c.f29801t0 = 2;
                objM15482b = AbstractC2124C.m3221t(c9478cM10468a, c10061c);
                list = arrayList4;
                break;
                break;
        }
    }

    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: b */
    public final C3516e mo1966b() {
        switch (this.f11191Y) {
            case 0:
                break;
        }
        return AbstractC0593T.f1824a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: c */
    public Object m4398c(Application application, C20263a0 c20263a0, C9513a c9513a, AbstractC19687c abstractC19687c) {
        C10059a c10059a;
        C3688e c3688e;
        if (abstractC19687c instanceof C10059a) {
            c10059a = (C10059a) abstractC19687c;
            int i10 = c10059a.f29789s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c10059a.f29789s0 = i10 - Integer.MIN_VALUE;
            } else {
                c10059a = new C10059a(this, abstractC19687c);
            }
        } else {
            c10059a = new C10059a(this, abstractC19687c);
        }
        Object objM4400e = c10059a.f29787q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c10059a.f29789s0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM4400e);
            c10059a.f29783Y = this;
            c10059a.f29784Z = application;
            c10059a.f29785o0 = c20263a0;
            c10059a.f29786p0 = c9513a;
            c10059a.f29789s0 = 1;
            objM4400e = m4400e(application, c20263a0, c10059a);
            if (objM4400e == enumC19250a) {
                return enumC19250a;
            }
            c3688e = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c9513a = c10059a.f29786p0;
            c20263a0 = c10059a.f29785o0;
            application = c10059a.f29784Z;
            c3688e = c10059a.f29783Y;
            AbstractC9233X.m9807c(objM4400e);
        }
        IconCompat iconCompat = (IconCompat) objM4400e;
        if (iconCompat == null) {
            return null;
        }
        C11242m c11242m = new C11242m(application, c20263a0.f64085b);
        Intent intent = new Intent();
        int i12 = AbstractC11372a0.f34379a;
        AbstractC9186P.m9748b(intent, "https://chatgpt.com/g/" + c20263a0.f64085b);
        c3688e.getClass();
        intent.putExtra("com.openai.feature.shortcut.impl.ShortcutInitializer.EXTRA_SHORTCUT", true);
        Intent[] intentArr = {intent};
        C18287a c18287a = (C18287a) c11242m.f34018Y;
        c18287a.f58379c = intentArr;
        c18287a.f58381e = iconCompat;
        c18287a.f58383g = true;
        c18287a.f58380d = c20263a0.f64086c.f64081a;
        if (((Boolean) ((C13993t2) c3688e.f11196r0).m15479a(C13907X1.f43957d)).booleanValue()) {
            c9513a.getClass();
            c11242m.m12613r(c9513a.f28636b);
        }
        return c11242m.m12614s();
    }

    /* JADX INFO: renamed from: d */
    public C18287a m4399d(Application application, EnumC5421r enumC5421r, int i10, int i11, C9513a c9513a) {
        Intent intentM9981a = AbstractC9405z3.m9981a(application, C5431w.m5902f(C5431w.f17746g, enumC5421r, null, false, false, 14), AbstractC17681o.m19382k(268435456, 131072));
        if (intentM9981a == null) {
            return null;
        }
        intentM9981a.putExtra("com.openai.feature.shortcut.impl.ShortcutInitializer.EXTRA_SHORTCUT", true);
        C11242m c11242m = new C11242m(application, enumC5421r.name());
        Intent[] intentArr = {intentM9981a};
        C18287a c18287a = (C18287a) c11242m.f34018Y;
        c18287a.f58379c = intentArr;
        PorterDuff.Mode mode = IconCompat.f32890k;
        c18287a.f58381e = IconCompat.m11384b(application.getResources(), application.getPackageName(), i11);
        c18287a.f58383g = true;
        c18287a.f58380d = application.getString(i10);
        if (((Boolean) ((C13993t2) this.f11196r0).m15479a(C13907X1.f43957d)).booleanValue()) {
            c11242m.m12613r(c9513a.f28636b);
        }
        return c11242m.m12614s();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public Object m4400e(Application application, C20263a0 c20263a0, AbstractC19687c abstractC19687c) {
        C10060b c10060b;
        Bitmap bitmap;
        if (abstractC19687c instanceof C10060b) {
            c10060b = (C10060b) abstractC19687c;
            int i10 = c10060b.f29793p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c10060b.f29793p0 = i10 - Integer.MIN_VALUE;
            } else {
                c10060b = new C10060b(this, abstractC19687c);
            }
        } else {
            c10060b = new C10060b(this, abstractC19687c);
        }
        Object objM1898b = c10060b.f29791Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c10060b.f29793p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM1898b);
            C6351d c6351d = new C6351d(application);
            c6351d.f20623c = c20263a0.f64086c.f64082b;
            C6354g c6354gM6972a = c6351d.m6972a();
            c10060b.f29790Y = application;
            c10060b.f29793p0 = 1;
            objM1898b = ((C0840x) ((InterfaceC0832p) this.f11197s0)).m1898b(c6354gM6972a, c10060b);
            if (objM1898b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = c10060b.f29790Y;
            AbstractC9233X.m9807c(objM1898b);
        }
        InterfaceC6357j interfaceC6357j = (InterfaceC6357j) objM1898b;
        if (!(interfaceC6357j instanceof C6363p)) {
            return null;
        }
        InterfaceC0829m interfaceC0829m = ((C6363p) interfaceC6357j).f20707a;
        Resources resources = application.getResources();
        AbstractC16544l.m18093f(resources, "getResources(...)");
        Drawable drawableM1889b = AbstractC0833q.m1889b(interfaceC0829m, resources);
        int intrinsicWidth = drawableM1889b.getIntrinsicWidth();
        int intrinsicHeight = drawableM1889b.getIntrinsicHeight();
        if (drawableM1889b instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawableM1889b;
            if (bitmapDrawable.getBitmap() == null) {
                throw new IllegalArgumentException("bitmap is null");
            }
            bitmap = (intrinsicWidth == bitmapDrawable.getBitmap().getWidth() && intrinsicHeight == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), intrinsicWidth, intrinsicHeight, true);
        } else {
            Rect bounds = drawableM1889b.getBounds();
            int i12 = bounds.left;
            int i13 = bounds.top;
            int i14 = bounds.right;
            int i15 = bounds.bottom;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            drawableM1889b.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawableM1889b.draw(new Canvas(bitmapCreateBitmap));
            drawableM1889b.setBounds(i12, i13, i14, i15);
            bitmap = bitmapCreateBitmap;
        }
        PorterDuff.Mode mode = IconCompat.f32890k;
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f32892b = bitmap;
        return iconCompat;
    }

    public C3688e(Application application, InterfaceC13849E interfaceC13849E, C9473F c9473f, C1991h c1991h, C13993t2 c13993t2, InterfaceC0832p interfaceC0832p) {
        this.f11193o0 = application;
        this.f11192Z = interfaceC13849E;
        this.f11194p0 = c9473f;
        this.f11195q0 = c1991h;
        this.f11196r0 = c13993t2;
        this.f11197s0 = interfaceC0832p;
    }
}
