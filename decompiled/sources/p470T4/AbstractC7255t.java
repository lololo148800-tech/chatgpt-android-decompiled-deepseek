package p470T4;

import android.app.ActivityManager;
import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.foundation.lazy.layout.AbstractC10848c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.protobuf.AbstractC12107L1;
import com.openai.chatgpt.R;
import ge.C14103t0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1012t.C19711a;
import p110E4.C2304b;
import p110E4.C2311i;
import p110E4.C2312j;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p124Ei.C2502d1;
import p127El.ExecutorC2575a;
import p134F4.AbstractC2664a;
import p153Fn.C2925c;
import p207I4.InterfaceC3616c;
import p225Im.InterfaceC3771s;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6035w;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p444S4.C6995a;
import p444S4.C7011q;
import p444S4.C7012r;
import p492U1.EnumC7546k;
import p495U4.C7557c;
import p501Ub.ExecutorC7613o;
import p539W4.C8426b;
import p544W9.AbstractC8485H;
import p613Z4.C10165l;
import p635a1.InterfaceC10459q;
import p636a2.C10467d;
import p636a2.C10470g;
import p636a2.C10472i;
import p658b5.C11241l;
import p674c5.AbstractC11655h;
import p719e5.C13285a;
import p774h1.InterfaceC14324B;
import p823j3.C16084f;
import p860l0.EnumC16673F0;
import p860l0.InterfaceC16661B0;
import p909nm.AbstractC17681o;
import p909nm.C17690x;
import p911o0.InterfaceC17763i0;
import p953q0.AbstractC18551I;
import p959q8.C18639a;
import p977r0.C18829a;
import p977r0.C18836h;
import p977r0.C18841m;
import p977r0.C18846r;
import p977r0.C18847s;
import p977r0.C18852x;

/* JADX INFO: renamed from: T4.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7255t {
    /* JADX INFO: renamed from: a */
    public static final void m7693a(C18852x c18852x, C18847s c18847s, InterfaceC10459q interfaceC10459q, InterfaceC17763i0 interfaceC17763i0, boolean z6, InterfaceC16661B0 interfaceC16661B0, boolean z10, float f10, float f11, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10, int i11) {
        int i12;
        int i13;
        InterfaceC3771s interfaceC3771s;
        C6021p c6021p2;
        EnumC16673F0 enumC16673F0 = EnumC16673F0.f53401Y;
        c6021p.m6526U(288295126);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(c18852x) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(enumC16673F0) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= (i10 & 512) == 0 ? c6021p.m6542f(c18847s) : c6021p.m6545h(c18847s) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c6021p.m6542f(interfaceC17763i0) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= c6021p.m6544g(z6) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= c6021p.m6542f(interfaceC16661B0) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c6021p.m6544g(z10) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c6021p.m6536c(f10) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c6021p.m6536c(f11) ? 536870912 : 268435456;
        }
        int i14 = i12;
        if ((i11 & 6) == 0) {
            i13 = i11 | (c6021p.m6545h(interfaceC1436k) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i14 & 306783379) == 306783378 && (i13 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6519N();
            int i15 = i10 & 1;
            C5975S c5975s = C6013l.f19514a;
            if (i15 != 0 && !c6021p.m6561x()) {
                c6021p.m6517L();
            }
            c6021p.m6554q();
            int i16 = i14 & 14;
            InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(interfaceC1436k, c6021p);
            boolean zM6542f = c6021p.m6542f(c18852x);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == c5975s) {
                C5975S c5975s2 = C5975S.f19446p0;
                objM6514H = new C2502d1(0, 10, InterfaceC5982V0.class, C5997d.m6422I(new C16084f(C5997d.m6422I(new C14103t0(interfaceC5985XM6435V, 11), c5975s2), 9, c18852x), c5975s2), "value", "getValue()Ljava/lang/Object;");
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC3771s interfaceC3771s2 = (InterfaceC3771s) objM6514H;
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == c5975s) {
                objM6514H2 = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            C2925c c2925c = ((C6035w) objM6514H2).f19668Y;
            InterfaceC14324B interfaceC14324B = (InterfaceC14324B) c6021p.m6548k(AbstractC0187M0.f703e);
            int i17 = i14 >> 6;
            int i18 = i16 | (i17 & 896);
            int i19 = i17 & 7168;
            int i20 = i14 >> 9;
            int i21 = i18 | i19 | ((i14 << 9) & 57344) | (i20 & 458752) | (i20 & 3670016) | ((i14 << 18) & 234881024);
            boolean z11 = true;
            boolean zM6542f2 = c6021p.m6542f(c18852x) | c6021p.m6542f(interfaceC3771s2) | ((((i21 & 896) ^ 384) > 256 && c6021p.m6542f(interfaceC17763i0)) || (i21 & 384) == 256) | ((((i21 & 7168) ^ 3072) > 2048 && c6021p.m6544g(z6)) || (i21 & 3072) == 2048) | ((((i21 & 57344) ^ 24576) > 16384 && c6021p.m6542f(enumC16673F0)) || (i21 & 24576) == 16384) | ((((i21 & 458752) ^ 196608) > 131072 && c6021p.m6536c(f10)) || (196608 & i21) == 131072) | ((((i21 & 3670016) ^ 1572864) > 1048576 && c6021p.m6536c(f11)) || (i21 & 1572864) == 1048576) | ((((i21 & 234881024) ^ 100663296) > 67108864 && c6021p.m6542f(c18847s)) || (i21 & 100663296) == 67108864) | c6021p.m6542f(interfaceC14324B);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f2 || objM6514H3 == c5975s) {
                interfaceC3771s = interfaceC3771s2;
                c6021p2 = c6021p;
                C18841m c18841m = new C18841m(c18852x, c18847s, interfaceC3771s, interfaceC17763i0, z6, f10, c2925c, interfaceC14324B);
                c6021p2.m6537c0(c18841m);
                objM6514H3 = c18841m;
            } else {
                c6021p2 = c6021p;
                interfaceC3771s = interfaceC3771s2;
            }
            InterfaceC1439n interfaceC1439n = (InterfaceC1439n) objM6514H3;
            int i22 = i16 | ((i14 >> 12) & 112);
            boolean zM6542f3 = c6021p2.m6542f(c18852x);
            if ((((i22 & 112) ^ 48) <= 32 || !c6021p2.m6544g(z6)) && (i22 & 48) != 32) {
                z11 = false;
            }
            boolean z12 = zM6542f3 | z11;
            Object objM6514H4 = c6021p.m6514H();
            if (z12 || objM6514H4 == c5975s) {
                objM6514H4 = new C18846r(c18852x);
                c6021p2.m6537c0(objM6514H4);
            }
            InterfaceC10459q interfaceC10459qM11270a = AbstractC10848c.m11270a(interfaceC10459q.mo428M(c18852x.f60048g).mo428M(c18852x.f60049h), interfaceC3771s, (C18846r) objM6514H4, enumC16673F0, z10, z6);
            boolean zM6542f4 = c6021p2.m6542f(c18852x);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6542f4 || objM6514H5 == c5975s) {
                objM6514H5 = new C18829a(c18852x);
                c6021p2.m6537c0(objM6514H5);
            }
            AbstractC18551I.m19920a(interfaceC3771s, AbstractC8485H.m9138a(AbstractC18551I.m19930n(interfaceC10459qM11270a, (C18829a) objM6514H5, c18852x.f60050i, z6, (EnumC7546k) c6021p2.m6548k(AbstractC0187M0.f710l), enumC16673F0, z10, c6021p, 512 | i19 | ((i14 << 12) & 458752) | ((i14 >> 3) & 3670016)).mo428M(c18852x.f60059r.f32543k), c18852x, enumC16673F0, z10, z6, interfaceC16661B0, c18852x.f60057p, null, c6021p, 64), c18852x.f60052k, interfaceC1439n, c6021p, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18836h(c18852x, c18847s, interfaceC10459q, interfaceC17763i0, z6, interfaceC16661B0, z10, f10, f11, interfaceC1436k, i10, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C7253r m7694b(Context p10, C6995a c6995a) {
        C2311i c2311i;
        int i10;
        int i11;
        boolean zContainsKey;
        AbstractC16544l.m18094g(p10, "context");
        C13285a c13285a = new C13285a(c6995a.f22378b);
        Context applicationContext = p10.getApplicationContext();
        AbstractC16544l.m18093f(applicationContext, "context.applicationContext");
        ExecutorC7613o executorC7613o = c13285a.f41990a;
        AbstractC16544l.m18093f(executorC7613o, "workTaskExecutor.serialTaskExecutor");
        boolean z6 = p10.getResources().getBoolean(R.bool.workmanager_test_configuration);
        C7012r clock = c6995a.f22379c;
        AbstractC16544l.m18094g(clock, "clock");
        if (z6) {
            c2311i = new C2311i(applicationContext, null);
            c2311i.f7184i = true;
        } else {
            if (AbstractC21322p.m21681O("androidx.work.workdb")) {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            }
            C2311i c2311i2 = new C2311i(applicationContext, "androidx.work.workdb");
            c2311i2.f7183h = new C7248m(applicationContext);
            c2311i = c2311i2;
        }
        c2311i.f7181f = executorC7613o;
        C7237b c7237b = new C7237b(clock);
        ArrayList arrayList = c2311i.f7178c;
        arrayList.add(c7237b);
        c2311i.m3415a(C7239d.f22949h);
        c2311i.m3415a(new C7242g(applicationContext, 2, 3));
        c2311i.m3415a(C7239d.f22950i);
        c2311i.m3415a(C7239d.f22951j);
        c2311i.m3415a(new C7242g(applicationContext, 5, 6));
        c2311i.m3415a(C7239d.f22952k);
        c2311i.m3415a(C7239d.f22953l);
        c2311i.m3415a(C7239d.f22954m);
        c2311i.m3415a(new C7242g(applicationContext));
        c2311i.m3415a(new C7242g(applicationContext, 10, 11));
        c2311i.m3415a(C7239d.f22945d);
        c2311i.m3415a(C7239d.f22946e);
        c2311i.m3415a(C7239d.f22947f);
        c2311i.m3415a(C7239d.f22948g);
        c2311i.f7186k = false;
        c2311i.f7187l = true;
        Executor executor = c2311i.f7181f;
        if (executor == null && c2311i.f7182g == null) {
            ExecutorC2575a executorC2575a = C19711a.f62403c;
            c2311i.f7182g = executorC2575a;
            c2311i.f7181f = executorC2575a;
        } else if (executor != null && c2311i.f7182g == null) {
            c2311i.f7182g = executor;
        } else if (executor == null) {
            c2311i.f7181f = c2311i.f7182g;
        }
        HashSet hashSet = c2311i.f7191p;
        LinkedHashSet linkedHashSet = c2311i.f7190o;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(AbstractC10763a.m11048f(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                }
            }
        }
        InterfaceC3616c c18639a = c2311i.f7183h;
        if (c18639a == null) {
            c18639a = new C18639a(8);
        }
        InterfaceC3616c interfaceC3616c = c18639a;
        if (c2311i.f7188m > 0) {
            if (c2311i.f7177b != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        boolean z10 = c2311i.f7184i;
        int i12 = c2311i.f7185j;
        if (i12 == 0) {
            throw null;
        }
        Context context = c2311i.f7176a;
        if (i12 != 1) {
            i10 = i12;
        } else {
            Object systemService = context.getSystemService("activity");
            AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            i10 = !((ActivityManager) systemService).isLowRamDevice() ? 3 : 2;
        }
        Executor executor2 = c2311i.f7181f;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = c2311i.f7182g;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C2304b c2304b = new C2304b(context, c2311i.f7177b, interfaceC3616c, c2311i.f7189n, arrayList, z10, i10, executor2, executor3, c2311i.f7186k, c2311i.f7187l, linkedHashSet, c2311i.f7179d, c2311i.f7180e);
        Package r6 = WorkDatabase.class.getPackage();
        AbstractC16544l.m18091d(r6);
        String fullPackage = r6.getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        AbstractC16544l.m18091d(canonicalName);
        AbstractC16544l.m18093f(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            AbstractC16544l.m18093f(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String strConcat = AbstractC21329w.m21730q(canonicalName, '.', '_').concat("_Impl");
        try {
            Class<?> cls = Class.forName(fullPackage.length() == 0 ? strConcat : fullPackage + '.' + strConcat, true, WorkDatabase.class.getClassLoader());
            AbstractC16544l.m18092e(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            WorkDatabase workDatabase = (WorkDatabase) cls.newInstance();
            workDatabase.getClass();
            workDatabase.f33704c = workDatabase.mo12342e(c2304b);
            Set setMo12346i = workDatabase.mo12346i();
            BitSet bitSet = new BitSet();
            Iterator it2 = setMo12346i.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                LinkedHashMap linkedHashMap = workDatabase.f33708g;
                ArrayList arrayList2 = c2304b.f7155n;
                if (zHasNext) {
                    Class cls2 = (Class) it2.next();
                    int size = arrayList2.size() - 1;
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    while (true) {
                        int i13 = size - 1;
                        if (cls2.isAssignableFrom(arrayList2.get(size).getClass())) {
                            bitSet.set(size);
                            break;
                        }
                        if (i13 < 0) {
                            size = -1;
                            break;
                        }
                        size = i13;
                    }
                    if (size < 0) {
                        throw new IllegalArgumentException(("A required auto migration spec (" + cls2.getCanonicalName() + ") is missing in the database configuration.").toString());
                    }
                    linkedHashMap.put(cls2, arrayList2.get(size));
                } else {
                    int size2 = arrayList2.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i14 = size2 - 1;
                            if (!bitSet.get(size2)) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            }
                            if (i14 < 0) {
                                break;
                            }
                            size2 = i14;
                        }
                    }
                    for (AbstractC2664a abstractC2664a : workDatabase.mo12344g(linkedHashMap)) {
                        int i15 = abstractC2664a.f8174a;
                        C2312j c2312j = c2304b.f7145d;
                        LinkedHashMap linkedHashMap2 = c2312j.f7192a;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i15))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i15));
                            if (map == null) {
                                map = C17690x.f56481Y;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(abstractC2664a.f8175b));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            c2312j.m3416a(abstractC2664a);
                        }
                    }
                    workDatabase.m12345h().setWriteAheadLoggingEnabled(c2304b.f7148g == 3);
                    workDatabase.f33707f = c2304b.f7146e;
                    workDatabase.f33703b = c2304b.f7149h;
                    Executor executor4 = c2304b.f7150i;
                    AbstractC16544l.m18094g(executor4, "executor");
                    new ArrayDeque();
                    workDatabase.f33706e = c2304b.f7147f;
                    Map mapMo12347j = workDatabase.mo12347j();
                    BitSet bitSet2 = new BitSet();
                    Iterator it3 = mapMo12347j.entrySet().iterator();
                    while (true) {
                        boolean zHasNext2 = it3.hasNext();
                        ArrayList arrayList3 = c2304b.f7154m;
                        if (!zHasNext2) {
                            int size3 = arrayList3.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i16 = size3 - 1;
                                    if (!bitSet2.get(size3)) {
                                        throw new IllegalArgumentException(AbstractC12107L1.m13824o(arrayList3.get(size3), "Unexpected type converter ", ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."));
                                    }
                                    if (i16 >= 0) {
                                        size3 = i16;
                                    }
                                }
                            }
                            Context applicationContext2 = p10.getApplicationContext();
                            AbstractC16544l.m18093f(applicationContext2, "context.applicationContext");
                            C10165l p11 = new C10165l(applicationContext2, c13285a);
                            C7241f c7241f = new C7241f(p10.getApplicationContext(), c6995a, c13285a, workDatabase);
                            C7254s.f23006Y.getClass();
                            AbstractC16544l.m18094g(p10, "p0");
                            AbstractC16544l.m18094g(p11, "p4");
                            String str = AbstractC7245j.f22978a;
                            C8426b c8426b = new C8426b(p10, workDatabase, c6995a);
                            AbstractC11655h.m13018a(p10, SystemJobService.class, true);
                            C7011q.m7408d().m7410a(AbstractC7245j.f22978a, "Created SystemJobScheduler and enabled SystemJobService");
                            return new C7253r(p10.getApplicationContext(), c6995a, c13285a, workDatabase, AbstractC17681o.m19382k(c8426b, new C7557c(p10, c6995a, p11, c7241f, new C11241l(c7241f, c13285a), c13285a)), c7241f, p11);
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        Class cls3 = (Class) entry.getKey();
                        for (Class cls4 : (List) entry.getValue()) {
                            int size4 = arrayList3.size() - 1;
                            if (size4 < 0) {
                                i11 = -1;
                                break;
                            }
                            while (true) {
                                int i17 = size4 - 1;
                                if (cls4.isAssignableFrom(arrayList3.get(size4).getClass())) {
                                    bitSet2.set(size4);
                                    i11 = size4;
                                    break;
                                }
                                if (i17 < 0) {
                                    i11 = -1;
                                    break;
                                }
                                size4 = i17;
                            }
                            if (!(i11 >= 0)) {
                                throw new IllegalArgumentException(("A required type converter (" + cls4 + ") for " + cls3.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                            workDatabase.f33712k.put(cls4, arrayList3.get(i11));
                        }
                    }
                }
            }
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + strConcat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + WorkDatabase.class + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class + ".canonicalName");
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m7695c(Bitmap bitmap) {
        int i10;
        if (bitmap.isRecycled()) {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            Bitmap.Config config = bitmap.getConfig();
            if (config == Bitmap.Config.ALPHA_8) {
                i10 = 1;
            } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                i10 = 2;
            } else {
                i10 = (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8;
            }
            return i10 * height;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m7696d(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    /* JADX INFO: renamed from: e */
    public static void m7697e(C10470g c10470g, C10472i anchor, float f10, int i10) {
        if ((i10 & 2) != 0) {
            f10 = 0;
        }
        c10470g.getClass();
        AbstractC16544l.m18094g(anchor, "anchor");
        c10470g.f31010a.add(new C10467d(c10470g, anchor, f10, 0, 1));
    }
}
