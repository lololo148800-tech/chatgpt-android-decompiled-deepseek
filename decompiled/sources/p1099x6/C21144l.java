package p1099x6;

import io.sentry.clientreport.C15333a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import mm.C17309l;
import mm.C17314q;
import p001A.C0017I0;
import p008A6.C0383c;
import p008A6.C0388h;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p060C6.C1608e;
import p1057v6.C20461a;
import p1057v6.C20462b;
import p1057v6.C20463c;
import p1057v6.C20468h;
import p1076w6.C20843a;
import p1076w6.C20844b;
import p1076w6.C20848f;
import p1122y6.C21390a;
import p523V9.AbstractC8167p5;
import p523V9.AbstractC8183r5;
import p593Y8.C9683j;
import p784hb.C14438g;
import p825j5.InterfaceC16130g;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p909nm.C17689w;
import p909nm.C17690x;
import p917o6.C17859l;
import p917o6.InterfaceC17842J;
import p999s.C19341c1;

/* JADX INFO: renamed from: x6.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21144l implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f67191Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f67192Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f67193o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f67194p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f67195q0;

    public /* synthetic */ C21144l(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f67191Y = i10;
        this.f67192Z = obj;
        this.f67193o0 = obj2;
        this.f67194p0 = obj3;
        this.f67195q0 = obj4;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() throws Throwable {
        Object obj;
        Set setM21112a;
        C20468h c20468h;
        switch (this.f67191Y) {
            case 0:
                InterfaceC17842J interfaceC17842J = (InterfaceC17842J) this.f67192Z;
                C0017I0 this$0 = (C0017I0) this.f67193o0;
                AbstractC16544l.m18094g(this$0, "this$0");
                C20461a cacheHeaders = (C20461a) this.f67194p0;
                AbstractC16544l.m18094g(cacheHeaders, "$cacheHeaders");
                C14438g c14438g = (C14438g) this.f67195q0;
                C20848f cache = (C20848f) ((C17314q) this$0.f68q0).getValue();
                AbstractC16544l.m18094g(cache, "cache");
                C20463c c20463c = (C20463c) this$0.f65Z;
                String rootKey = C20462b.f64955c.f64956a;
                C17859l c17859lMo19588a = interfaceC17842J.mo19588a();
                String str = interfaceC17842J.mo19588a().f56948b.mo9703b().f56956a;
                List rootSelections = c17859lMo19588a.f56951e;
                AbstractC16544l.m18094g(rootKey, "rootKey");
                AbstractC16544l.m18094g(cacheHeaders, "cacheHeaders");
                AbstractC16544l.m18094g(rootSelections, "rootSelections");
                C19341c1 c19341c1 = new C19341c1();
                c19341c1.f61254Y = cache;
                c19341c1.f61255Z = c14438g;
                c19341c1.f61256o0 = c20463c;
                c19341c1.f61257p0 = cacheHeaders;
                c19341c1.f61258q0 = rootSelections;
                c19341c1.f61259r0 = new LinkedHashMap();
                c19341c1.f61260s0 = new ArrayList();
                ArrayList arrayList = (ArrayList) c19341c1.f61260s0;
                arrayList.add(new C20844b(rootKey, C17689w.f56480Y, rootSelections, str));
                while (true) {
                    boolean zIsEmpty = arrayList.isEmpty();
                    LinkedHashMap linkedHashMap = (LinkedHashMap) c19341c1.f61259r0;
                    if (zIsEmpty) {
                        return new C20843a(linkedHashMap);
                    }
                    ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((C20844b) it.next()).f66276a);
                    }
                    Collection collectionMo4517H = ((C20848f) c19341c1.f61254Y).mo4517H(arrayList2, (C20461a) c19341c1.f61257p0);
                    int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(collectionMo4517H, 10));
                    if (iM19257b < 16) {
                        iM19257b = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM19257b);
                    for (Object obj2 : collectionMo4517H) {
                        linkedHashMap2.put(((C20468h) obj2).f64972Y, obj2);
                    }
                    List<C20844b> listM19322C0 = AbstractC17680n.m19322C0(arrayList);
                    arrayList.clear();
                    for (C20844b c20844b : listM19322C0) {
                        Object c20468h2 = linkedHashMap2.get(c20844b.f66276a);
                        if (c20468h2 == null) {
                            String str2 = C20462b.f64955c.f64956a;
                            String str3 = c20844b.f66276a;
                            if (!AbstractC16544l.m18089b(str3, str2)) {
                                throw new C1608e(str3, null, false);
                            }
                            c20468h2 = new C20468h(str3, C17690x.f56481Y, null);
                        }
                        C20468h c20468h3 = (C20468h) c20468h2;
                        Object obj3 = c20468h3.get("__typename");
                        String str4 = obj3 instanceof String ? (String) obj3 : null;
                        String str5 = c20844b.f66279d;
                        C14438g c14438g2 = (C14438g) c19341c1.f61255Z;
                        ArrayList arrayListM20439f = C19341c1.m20439f(c20844b.f66278c, str5, c14438g2, str4);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = arrayListM20439f.iterator();
                        while (true) {
                            boolean zHasNext = it2.hasNext();
                            obj = c20844b.f66277b;
                            if (zHasNext) {
                                C17859l c17859l = (C17859l) it2.next();
                                AbstractC8183r5.m8765c(c17859l, (Map) c14438g2.f45414Y);
                                Object objM21110a = ((C20463c) c19341c1.f61256o0).m21110a(c17859l, c14438g2, (Map) c20468h2, c20468h3.f64972Y);
                                String str6 = c17859l.f56947a;
                                c19341c1.m20444k(objM21110a, AbstractC17680n.m19362l0((Collection) obj, str6), c17859l.f56951e, c17859l.f56948b.mo9703b().f56956a);
                                arrayList3.add(new C17309l(str6, objM21110a));
                            }
                        }
                        linkedHashMap.put(obj, AbstractC17659D.m19253o(arrayList3));
                    }
                }
                break;
            default:
                C21390a this$1 = (C21390a) this.f67192Z;
                AbstractC16544l.m18094g(this$1, "this$0");
                Collection records = (Collection) this.f67193o0;
                AbstractC16544l.m18094g(records, "$records");
                C16525B c16525b = (C16525B) this.f67194p0;
                Collection<C20468h> collection = records;
                ArrayList arrayList4 = new ArrayList(AbstractC17682p.m19389r(collection, 10));
                Iterator it3 = collection.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((C20468h) it3.next()).f64972Y);
                }
                ArrayList arrayListM21772Q = this$1.m21772Q(arrayList4);
                int iM19257b2 = AbstractC17660E.m19257b(AbstractC17682p.m19389r(arrayListM21772Q, 10));
                if (iM19257b2 < 16) {
                    iM19257b2 = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM19257b2);
                for (Object obj4 : arrayListM21772Q) {
                    linkedHashMap3.put(((C20468h) obj4).f64972Y, obj4);
                }
                ArrayList arrayList5 = new ArrayList();
                for (C20468h c20468h4 : collection) {
                    C20468h c20468h5 = (C20468h) linkedHashMap3.get(c20468h4.f64972Y);
                    C15333a c15333a = this$1.f67899o0;
                    Long l4 = (Long) this.f67195q0;
                    C0388h c0388h = (C0388h) c15333a.f47885Y;
                    if (c20468h5 == null) {
                        if (l4 == null) {
                            c20468h = c20468h4;
                        } else {
                            Map map = c20468h4.f64973Z;
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap(AbstractC17660E.m19257b(map.size()));
                            Iterator it4 = map.entrySet().iterator();
                            while (it4.hasNext()) {
                                linkedHashMap4.put(((Map.Entry) it4.next()).getKey(), l4);
                            }
                            c20468h = new C20468h(c20468h4.f64972Y, map, c20468h4.f64974o0, linkedHashMap4);
                        }
                        final String strM8746f = AbstractC8167p5.m8746f(c20468h);
                        final String key = c20468h.f64972Y;
                        AbstractC16544l.m18094g(key, "key");
                        final int i10 = 0;
                        ((C9683j) c0388h.f11539Z).m10277e(1943613296, "INSERT INTO records (key, record) VALUES (?,?)", new InterfaceC1436k() { // from class: A6.b
                            @Override // p049Bm.InterfaceC1436k
                            public final Object invoke(Object obj5) {
                                InterfaceC16130g execute = (InterfaceC16130g) obj5;
                                switch (i10) {
                                    case 0:
                                        String key2 = key;
                                        AbstractC16544l.m18094g(key2, "$key");
                                        String record = strM8746f;
                                        AbstractC16544l.m18094g(record, "$record");
                                        AbstractC16544l.m18094g(execute, "$this$execute");
                                        execute.mo17682c(0, key2);
                                        execute.mo17682c(1, record);
                                        break;
                                    default:
                                        String record2 = key;
                                        AbstractC16544l.m18094g(record2, "$record");
                                        String key3 = strM8746f;
                                        AbstractC16544l.m18094g(key3, "$key");
                                        AbstractC16544l.m18094g(execute, "$this$execute");
                                        execute.mo17682c(0, record2);
                                        execute.mo17682c(1, key3);
                                        break;
                                }
                                return C17296C.f55119a;
                            }
                        });
                        c0388h.m4519J(1943613296, new C0383c(0));
                        setM21112a = c20468h4.m21112a();
                    } else {
                        C17309l c17309lM21113b = c20468h5.m21113b(c20468h4, l4);
                        C20468h c20468h6 = (C20468h) c17309lM21113b.f55136Y;
                        setM21112a = (Set) c17309lM21113b.f55137Z;
                        if (!c20468h6.f64973Z.isEmpty()) {
                            final String strM8746f2 = AbstractC8167p5.m8746f(c20468h6);
                            final String key2 = c20468h6.f64972Y;
                            AbstractC16544l.m18094g(key2, "key");
                            final int i11 = 1;
                            ((C9683j) c0388h.f11539Z).m10277e(-2006407808, "UPDATE records SET record=? WHERE key=?", new InterfaceC1436k() { // from class: A6.b
                                @Override // p049Bm.InterfaceC1436k
                                public final Object invoke(Object obj5) {
                                    InterfaceC16130g execute = (InterfaceC16130g) obj5;
                                    switch (i11) {
                                        case 0:
                                            String key3 = strM8746f2;
                                            AbstractC16544l.m18094g(key3, "$key");
                                            String record = key2;
                                            AbstractC16544l.m18094g(record, "$record");
                                            AbstractC16544l.m18094g(execute, "$this$execute");
                                            execute.mo17682c(0, key3);
                                            execute.mo17682c(1, record);
                                            break;
                                        default:
                                            String record2 = strM8746f2;
                                            AbstractC16544l.m18094g(record2, "$record");
                                            String key4 = key2;
                                            AbstractC16544l.m18094g(key4, "$key");
                                            AbstractC16544l.m18094g(execute, "$this$execute");
                                            execute.mo17682c(0, record2);
                                            execute.mo17682c(1, key4);
                                            break;
                                    }
                                    return C17296C.f55119a;
                                }
                            });
                            c0388h.m4519J(-2006407808, new C0383c(2));
                        }
                    }
                    AbstractC17686t.m19398v(setM21112a, arrayList5);
                }
                c16525b.f51262Y = AbstractC17680n.m19328G0(arrayList5);
                return C17296C.f55119a;
        }
    }
}
