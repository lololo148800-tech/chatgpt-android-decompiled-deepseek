package ch;

import android.app.Activity;
import android.app.Application;
import com.revenuecat.purchases.CoroutinesExtensionsCommonKt;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.PurchaseResult;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.PurchasesTransactionException;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import gd.C13904W1;
import gd.C13993t2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import ni.C17628b;
import p025An.C0644w;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1155zi.AbstractC21933K1;
import p1155zi.C21929J1;
import p1155zi.C21941M1;
import p1155zi.C21952P1;
import p1155zi.C22076x1;
import p1155zi.EnumC21895B;
import p1155zi.EnumC21909E1;
import p1155zi.EnumC22080y1;
import p174Gk.uSfJ.HpucjswO;
import p195Hh.C3430e;
import p523V9.AbstractC8154o0;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p523V9.AbstractC8238y4;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9393x3;
import p588Y2.C9642z;
import p624Zg.AbstractC10331A;
import p624Zg.AbstractC10345O;
import p624Zg.C10336F;
import p624Zg.C10337G;
import p624Zg.C10338H;
import p624Zg.C10339I;
import p624Zg.C10340J;
import p624Zg.C10342L;
import p624Zg.C10346P;
import p624Zg.C10348S;
import p624Zg.C10385q;
import p624Zg.C10393y;
import p624Zg.C10394z;
import p624Zg.InterfaceC10333C;
import p624Zg.InterfaceC10334D;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17690x;
import p948pi.C18418a;
import p972qm.C18778k;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ch.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C11757k implements InterfaceC10334D {

    /* JADX INFO: renamed from: a */
    public final Application f35648a;

    /* JADX INFO: renamed from: b */
    public final C13993t2 f35649b;

    /* JADX INFO: renamed from: c */
    public final C18418a f35650c;

    /* JADX INFO: renamed from: d */
    public final C3430e f35651d = AbstractC8168p6.m8749b("RevenueCatPurchaseManager", null);

    /* JADX INFO: renamed from: e */
    public final C11751e f35652e = new UpdatedCustomerInfoListener() { // from class: ch.e
        @Override // com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener
        public final void onReceived(CustomerInfo it) {
            AbstractC16544l.m18094g(it, "it");
            C2153Q0 c2153q0 = this.f35632a.f35654g;
            C10385q c10385qM13043a = AbstractC11748b.m13043a(it);
            c2153q0.getClass();
            c2153q0.m3251l(null, c10385qM13043a);
        }
    };

    /* JADX INFO: renamed from: f */
    public final C2153Q0 f35653f = AbstractC2124C.m3204c(Boolean.FALSE);

    /* JADX INFO: renamed from: g */
    public final C2153Q0 f35654g;

    /* JADX INFO: renamed from: h */
    public final C2153Q0 f35655h;

    /* JADX INFO: renamed from: i */
    public Map f35656i;

    /* JADX WARN: Type inference failed for: r1v3, types: [ch.e] */
    public C11757k(Application application, C13993t2 c13993t2, C18418a c18418a, EnumC21895B enumC21895B, C17628b c17628b) {
        this.f35648a = application;
        this.f35649b = c13993t2;
        this.f35650c = c18418a;
        if (enumC21895B == EnumC21895B.f69418Y) {
            Purchases.INSTANCE.setLogLevel(LogLevel.DEBUG);
        }
        Purchases.INSTANCE.setLogHandler(C11750d.f35630a);
        c17628b.m19237b(new C11752f(this, null));
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(new C10385q(null, 7));
        this.f35654g = c2153q0M3204c;
        this.f35655h = c2153q0M3204c;
        this.f35656i = C17690x.f56481Y;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m13050a(AbstractC19687c abstractC19687c) {
        C11753g c11753g;
        C11757k c11757k;
        if (abstractC19687c instanceof C11753g) {
            c11753g = (C11753g) abstractC19687c;
            int i10 = c11753g.f35637p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11753g.f35637p0 = i10 - Integer.MIN_VALUE;
            } else {
                c11753g = new C11753g(this, abstractC19687c);
            }
        } else {
            c11753g = new C11753g(this, abstractC19687c);
        }
        Object objM20051a = c11753g.f35635Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11753g.f35637p0;
        if (i11 != 0) {
            if (i11 == 1) {
                c11757k = c11753g.f35634Y;
                AbstractC9233X.m9807c(objM20051a);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM20051a);
            }
        }
        AbstractC9233X.m9807c(objM20051a);
        C11754h c11754h = new C11754h(2, null);
        c11753g.f35634Y = this;
        c11753g.f35637p0 = 1;
        if (AbstractC2124C.m3220s(this.f35653f, c11754h, c11753g) == enumC19250a) {
            return enumC19250a;
        }
        c11757k = this;
        c11753g.f35634Y = c11757k;
        c11753g.f35637p0 = 2;
        C18778k c18778k = new C18778k(AbstractC8154o0.m8714e(c11753g));
        Purchases.Companion.canMakePayments$default(Purchases.INSTANCE, c11757k.f35648a, null, new C9642z(c18778k, 5), 2, null);
        objM20051a = c18778k.m20051a();
        return objM20051a == enumC19250a ? enumC19250a : objM20051a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m13052c(Activity activity, String str, InterfaceC10333C interfaceC10333C, AbstractC19687c abstractC19687c) {
        C11756j c11756j;
        PurchaseParams.Builder builder;
        C11757k c11757k;
        GoogleReplacementMode googleReplacementMode;
        AbstractC10345O abstractC10345OM8884h;
        if (abstractC19687c instanceof C11756j) {
            c11756j = (C11756j) abstractC19687c;
            int i10 = c11756j.f35647p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11756j.f35647p0 = i10 - Integer.MIN_VALUE;
            } else {
                c11756j = new C11756j(this, abstractC19687c);
            }
        } else {
            c11756j = new C11756j(this, abstractC19687c);
        }
        Object objAwaitPurchase = c11756j.f35645Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11756j.f35647p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objAwaitPurchase);
            Purchases.Companion companion = Purchases.INSTANCE;
            if (!companion.isConfigured()) {
                return C10339I.f30674o0;
            }
            Package r10 = (Package) this.f35656i.get(new C10336F(str));
            if (r10 == null) {
                return C10342L.f30679o0;
            }
            SubscriptionOptions subscriptionOptions = r10.getProduct().getSubscriptionOptions();
            SubscriptionOption freeTrial = subscriptionOptions != null ? subscriptionOptions.getFreeTrial() : null;
            if (this.f35650c.f58774b.m22326e() || freeTrial == null) {
                builder = new PurchaseParams.Builder(activity, r10);
            } else {
                if (((Boolean) this.f35649b.m15479a(C13904W1.f43954d)).booleanValue()) {
                    builder = new PurchaseParams.Builder(activity, freeTrial);
                } else {
                    builder = new PurchaseParams.Builder(activity, r10);
                }
            }
            if (interfaceC10333C instanceof AbstractC10331A) {
                AbstractC10331A abstractC10331A = (AbstractC10331A) interfaceC10333C;
                PurchaseParams.Builder builderOldProductId = builder.oldProductId(abstractC10331A.mo10885b().f69459Y);
                if (abstractC10331A instanceof C10394z) {
                    googleReplacementMode = GoogleReplacementMode.CHARGE_PRORATED_PRICE;
                } else {
                    if (!(abstractC10331A instanceof C10393y)) {
                        throw new C0644w();
                    }
                    googleReplacementMode = GoogleReplacementMode.DEFERRED;
                }
                builderOldProductId.googleReplacementMode(googleReplacementMode);
            }
            PurchaseParams purchaseParamsBuild = builder.build();
            try {
                Purchases sharedInstance = companion.getSharedInstance();
                c11756j.f35644Y = this;
                c11756j.f35647p0 = 1;
                objAwaitPurchase = CoroutinesExtensionsCommonKt.awaitPurchase(sharedInstance, purchaseParamsBuild, c11756j);
                if (objAwaitPurchase == enumC19250a) {
                    return enumC19250a;
                }
                c11757k = this;
            } catch (PurchasesTransactionException e10) {
                e = e10;
                c11757k = this;
                abstractC10345OM8884h = AbstractC8238y4.m8884h(e.getError());
                if (abstractC10345OM8884h != null || e.getUserCancelled()) {
                    return C10338H.f30673Y;
                }
                AbstractC8160o6.m8727b(c11757k.f35651d, "Error purchasing package from RevenueCat", abstractC10345OM8884h, 4);
                return abstractC10345OM8884h;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c11757k = c11756j.f35644Y;
            try {
                AbstractC9233X.m9807c(objAwaitPurchase);
            } catch (PurchasesTransactionException e11) {
                e = e11;
                abstractC10345OM8884h = AbstractC8238y4.m8884h(e.getError());
                if (abstractC10345OM8884h != null) {
                }
                return C10338H.f30673Y;
            }
        }
        PurchaseResult purchaseResult = (PurchaseResult) objAwaitPurchase;
        C10385q c10385qM13043a = AbstractC11748b.m13043a(purchaseResult.getCustomerInfo());
        C2153Q0 c2153q0 = c11757k.f35654g;
        c2153q0.getClass();
        c2153q0.m3251l(null, c10385qM13043a);
        StoreTransaction storeTransaction = purchaseResult.getStoreTransaction();
        AbstractC16544l.m18094g(storeTransaction, "<this>");
        String orderId = storeTransaction.getOrderId();
        return new C10346P(new C10348S(orderId != null ? orderId : null), c10385qM13043a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0221  */
    /* JADX WARN: Code duplicated, block: B:105:0x0230  */
    /* JADX WARN: Code duplicated, block: B:108:0x0251  */
    /* JADX WARN: Code duplicated, block: B:112:0x0267  */
    /* JADX WARN: Code duplicated, block: B:120:0x0277  */
    /* JADX WARN: Code duplicated, block: B:136:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[Catch: PurchasesException -> 0x0047, TryCatch #2 {PurchasesException -> 0x0047, blocks: (B:21:0x0043, B:33:0x006e, B:35:0x0078, B:36:0x007e), top: B:126:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007e A[Catch: PurchasesException -> 0x0047, TRY_LEAVE, TryCatch #2 {PurchasesException -> 0x0047, blocks: (B:21:0x0043, B:33:0x006e, B:35:0x0078, B:36:0x007e), top: B:126:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5 A[Catch: PurchasesException -> 0x0034, TRY_ENTER, TRY_LEAVE, TryCatch #0 {PurchasesException -> 0x0034, blocks: (B:14:0x002f, B:60:0x00e5, B:61:0x00f8, B:63:0x00fe, B:64:0x012d, B:67:0x013a, B:68:0x0143, B:70:0x0149, B:71:0x0160, B:72:0x016b, B:74:0x0171, B:76:0x017d, B:77:0x0181, B:52:0x00b5, B:55:0x00c1, B:57:0x00d4, B:56:0x00c8), top: B:122:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1 A[Catch: PurchasesException -> 0x0034, TRY_ENTER, TryCatch #0 {PurchasesException -> 0x0034, blocks: (B:14:0x002f, B:60:0x00e5, B:61:0x00f8, B:63:0x00fe, B:64:0x012d, B:67:0x013a, B:68:0x0143, B:70:0x0149, B:71:0x0160, B:72:0x016b, B:74:0x0171, B:76:0x017d, B:77:0x0181, B:52:0x00b5, B:55:0x00c1, B:57:0x00d4, B:56:0x00c8), top: B:122:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c8 A[Catch: PurchasesException -> 0x0034, TryCatch #0 {PurchasesException -> 0x0034, blocks: (B:14:0x002f, B:60:0x00e5, B:61:0x00f8, B:63:0x00fe, B:64:0x012d, B:67:0x013a, B:68:0x0143, B:70:0x0149, B:71:0x0160, B:72:0x016b, B:74:0x0171, B:76:0x017d, B:77:0x0181, B:52:0x00b5, B:55:0x00c1, B:57:0x00d4, B:56:0x00c8), top: B:122:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:99:0x0213  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [zi.y1] */
    /* JADX WARN: Type inference failed for: r12v1, types: [ch.k] */
    /* JADX WARN: Type inference failed for: r12v18, types: [zi.y1] */
    /* JADX WARN: Type inference failed for: r12v19, types: [ch.k] */
    /* JADX WARN: Type inference failed for: r12v20, types: [zi.y1] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX INFO: renamed from: b */
    public final Object m13051b(EnumC22080y1 enumC22080y1, AbstractC19687c abstractC19687c) {
        C11755i c11755i;
        C11757k c11757k;
        AbstractC10345O abstractC10345OM8884h;
        Object c21941m1;
        ?? r12;
        ?? r13;
        C11757k c11757k2;
        C21941M1 c21941m2;
        Throwable th2;
        boolean z6;
        ArrayList arrayList;
        Iterator it;
        C10337G c10337gM13044b;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList2;
        String value;
        Package r6;
        C17309l c17309l;
        String identifier;
        Object arrayList3;
        List listM19382k;
        ?? r14;
        Offering offering;
        if (abstractC19687c instanceof C11755i) {
            c11755i = (C11755i) abstractC19687c;
            int i10 = c11755i.f35643q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11755i.f35643q0 = i10 - Integer.MIN_VALUE;
            } else {
                c11755i = new C11755i(this, abstractC19687c);
            }
        } else {
            c11755i = new C11755i(this, abstractC19687c);
        }
        C11755i c11755i2 = c11755i;
        Object objAwaitOfferings = c11755i2.f35641o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11755i2.f35643q0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(objAwaitOfferings);
                Purchases.Companion companion = Purchases.INSTANCE;
                if (!companion.isConfigured()) {
                    return new C21941M1(C10339I.f30674o0);
                }
                try {
                    Purchases sharedInstance = companion.getSharedInstance();
                    c11755i2.f35639Y = this;
                    c11755i2.f35640Z = enumC22080y1;
                    c11755i2.f35643q0 = 1;
                    objAwaitOfferings = CoroutinesExtensionsCommonKt.awaitOfferings(sharedInstance, c11755i2);
                    if (objAwaitOfferings == enumC19250a) {
                        return enumC19250a;
                    }
                    c11757k = this;
                    r14 = enumC22080y1;
                    offering = ((Offerings) objAwaitOfferings).getOffering(r14.f69799Y);
                    if (offering != null) {
                        c21941m1 = new C21952P1(offering);
                        r12 = r14;
                    } else {
                        c21941m1 = new C21941M1(C10340J.f30675o0);
                        r12 = r14;
                    }
                    r13 = r12;
                    c11757k2 = c11757k;
                    if (c21941m1 instanceof C21941M1) {
                        c21941m2 = (C21941M1) c21941m1;
                    } else {
                        c21941m2 = null;
                    }
                    if (c21941m2 != null) {
                        th2 = c21941m2.f69485a;
                    } else {
                        th2 = null;
                    }
                    if (th2 instanceof C10340J) {
                        z6 = c21941m1 instanceof C21952P1;
                        if (z6) {
                            Offering offering2 = (Offering) ((C21952P1) c21941m1).f69511a;
                            c11757k2.getClass();
                            List<Package> availablePackages = offering2.getAvailablePackages();
                            linkedHashMap = new LinkedHashMap();
                            for (Object obj : availablePackages) {
                                identifier = ((Package) obj).getIdentifier();
                                arrayList3 = linkedHashMap.get(identifier);
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                    linkedHashMap.put(identifier, arrayList3);
                                }
                                ((List) arrayList3).add(obj);
                            }
                            arrayList2 = new ArrayList();
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                value = (String) entry.getKey();
                                r6 = (Package) AbstractC17680n.m19343S((List) entry.getValue());
                                if (r6 != null) {
                                    AbstractC16544l.m18094g(value, "value");
                                    c17309l = new C17309l(new C10336F(value), r6);
                                } else {
                                    c17309l = null;
                                }
                                if (c17309l != null) {
                                    arrayList2.add(c17309l);
                                }
                            }
                            c11757k2.f35656i = AbstractC17659D.m19253o(arrayList2);
                        }
                        if (z6) {
                            if (c21941m1 instanceof C21929J1) {
                                return c21941m1;
                            }
                            throw new C0644w();
                        }
                        Offering offering3 = (Offering) ((C21952P1) c21941m1).f69511a;
                        AbstractC16544l.m18094g(offering3, HpucjswO.ApcG);
                        List<Package> availablePackages2 = offering3.getAvailablePackages();
                        arrayList = new ArrayList();
                        it = availablePackages2.iterator();
                        while (it.hasNext()) {
                            c10337gM13044b = AbstractC11748b.m13044b((Package) it.next());
                            if (c10337gM13044b != null) {
                                arrayList.add(c10337gM13044b);
                            }
                        }
                        return new C21952P1(arrayList);
                    }
                    Purchases sharedInstance2 = Purchases.INSTANCE.getSharedInstance();
                    if (r13 == EnumC22080y1.f69796q0) {
                        EnumC21909E1 enumC21909E1 = EnumC21909E1.Plus;
                        listM19382k = AbstractC9393x3.m9974d("oai.chatgpt.pro");
                    } else {
                        EnumC21909E1 enumC21909E2 = EnumC21909E1.Plus;
                        listM19382k = AbstractC17681o.m19382k("oai.chatgpt.pro", "oai.chatgpt.plus");
                    }
                    c11755i2.f35639Y = c11757k2;
                    c11755i2.f35640Z = null;
                    c11755i2.f35643q0 = 2;
                    objAwaitOfferings = CoroutinesExtensionsCommonKt.awaitGetProducts$default(sharedInstance2, listM19382k, null, c11755i2, 2, null);
                    enumC22080y1 = c11757k2;
                    if (objAwaitOfferings == enumC19250a) {
                        return enumC19250a;
                    }
                } catch (PurchasesException e10) {
                    e = e10;
                    c11757k = this;
                    abstractC10345OM8884h = AbstractC8238y4.m8884h(e.getError());
                    if (abstractC10345OM8884h != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    AbstractC8160o6.m8727b(c11757k.f35651d, "Error fetching offerings from RevenueCat", abstractC10345OM8884h, 4);
                    c21941m1 = new C21941M1(abstractC10345OM8884h);
                    r12 = enumC22080y1;
                }
            } else if (i11 == 1) {
                enumC22080y1 = c11755i2.f35640Z;
                c11757k = c11755i2.f35639Y;
                try {
                    AbstractC9233X.m9807c(objAwaitOfferings);
                    r14 = enumC22080y1;
                    offering = ((Offerings) objAwaitOfferings).getOffering(r14.f69799Y);
                    if (offering != null) {
                        c21941m1 = new C21952P1(offering);
                        r12 = r14;
                    } else {
                        c21941m1 = new C21941M1(C10340J.f30675o0);
                        r12 = r14;
                    }
                } catch (PurchasesException e11) {
                    e = e11;
                    abstractC10345OM8884h = AbstractC8238y4.m8884h(e.getError());
                    if (abstractC10345OM8884h != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    AbstractC8160o6.m8727b(c11757k.f35651d, "Error fetching offerings from RevenueCat", abstractC10345OM8884h, 4);
                    c21941m1 = new C21941M1(abstractC10345OM8884h);
                    r12 = enumC22080y1;
                }
                r13 = r12;
                c11757k2 = c11757k;
                if (c21941m1 instanceof C21941M1) {
                    c21941m2 = (C21941M1) c21941m1;
                } else {
                    c21941m2 = null;
                }
                if (c21941m2 != null) {
                    th2 = c21941m2.f69485a;
                } else {
                    th2 = null;
                }
                if (th2 instanceof C10340J) {
                    z6 = c21941m1 instanceof C21952P1;
                    if (z6) {
                        Offering offering4 = (Offering) ((C21952P1) c21941m1).f69511a;
                        c11757k2.getClass();
                        List<Package> availablePackages3 = offering4.getAvailablePackages();
                        linkedHashMap = new LinkedHashMap();
                        while (r0.hasNext()) {
                            identifier = ((Package) obj).getIdentifier();
                            arrayList3 = linkedHashMap.get(identifier);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                                linkedHashMap.put(identifier, arrayList3);
                            }
                            ((List) arrayList3).add(obj);
                        }
                        arrayList2 = new ArrayList();
                        while (r1.hasNext()) {
                            value = (String) entry.getKey();
                            r6 = (Package) AbstractC17680n.m19343S((List) entry.getValue());
                            if (r6 != null) {
                                AbstractC16544l.m18094g(value, "value");
                                c17309l = new C17309l(new C10336F(value), r6);
                            } else {
                                c17309l = null;
                            }
                            if (c17309l != null) {
                                arrayList2.add(c17309l);
                            }
                        }
                        c11757k2.f35656i = AbstractC17659D.m19253o(arrayList2);
                    }
                    if (z6) {
                        if ((c21941m1 instanceof C21929J1) && !(c21941m1 instanceof AbstractC21933K1)) {
                            throw new C0644w();
                        }
                        return c21941m1;
                    }
                    Offering offering5 = (Offering) ((C21952P1) c21941m1).f69511a;
                    AbstractC16544l.m18094g(offering5, HpucjswO.ApcG);
                    List<Package> availablePackages4 = offering5.getAvailablePackages();
                    arrayList = new ArrayList();
                    it = availablePackages4.iterator();
                    while (it.hasNext()) {
                        c10337gM13044b = AbstractC11748b.m13044b((Package) it.next());
                        if (c10337gM13044b != null) {
                            arrayList.add(c10337gM13044b);
                        }
                    }
                    return new C21952P1(arrayList);
                }
                Purchases sharedInstance3 = Purchases.INSTANCE.getSharedInstance();
                if (r13 == EnumC22080y1.f69796q0) {
                    EnumC21909E1 enumC21909E3 = EnumC21909E1.Plus;
                    listM19382k = AbstractC9393x3.m9974d("oai.chatgpt.pro");
                } else {
                    EnumC21909E1 enumC21909E4 = EnumC21909E1.Plus;
                    listM19382k = AbstractC17681o.m19382k("oai.chatgpt.pro", "oai.chatgpt.plus");
                }
                c11755i2.f35639Y = c11757k2;
                c11755i2.f35640Z = null;
                c11755i2.f35643q0 = 2;
                objAwaitOfferings = CoroutinesExtensionsCommonKt.awaitGetProducts$default(sharedInstance3, listM19382k, null, c11755i2, 2, null);
                enumC22080y1 = c11757k2;
                if (objAwaitOfferings == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C11757k c11757k3 = c11755i2.f35639Y;
                AbstractC9233X.m9807c(objAwaitOfferings);
                enumC22080y1 = c11757k3;
            }
            List<StoreProduct> list = (List) objAwaitOfferings;
            ArrayList arrayList4 = new ArrayList(AbstractC17682p.m19389r(list, 10));
            for (StoreProduct storeProduct : list) {
                String str = "$rc_monthly/" + storeProduct.getId();
                PackageType packageType = PackageType.MONTHLY;
                C22076x1 c22076x1 = EnumC22080y1.Companion;
                arrayList4.add(new Package(str, packageType, storeProduct, new PresentedOfferingContext("pro")));
            }
            int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(arrayList4, 10));
            if (iM19257b < 16) {
                iM19257b = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM19257b);
            for (Object obj2 : arrayList4) {
                String value2 = ((Package) obj2).getIdentifier();
                AbstractC16544l.m18094g(value2, "value");
                linkedHashMap2.put(new C10336F(value2), obj2);
            }
            enumC22080y1.f35656i = linkedHashMap2;
            ArrayList arrayList5 = new ArrayList();
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                C10337G c10337gM13044b2 = AbstractC11748b.m13044b((Package) it2.next());
                if (c10337gM13044b2 != null) {
                    arrayList5.add(c10337gM13044b2);
                }
            }
            return new C21952P1(arrayList5);
        } catch (PurchasesException e12) {
            AbstractC10345O abstractC10345OM8884h2 = AbstractC8238y4.m8884h(e12.getError());
            if (abstractC10345OM8884h2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AbstractC8160o6.m8727b(enumC22080y1.f35651d, "Error fetching products from RevenueCat", abstractC10345OM8884h2, 4);
            return new C21941M1(abstractC10345OM8884h2);
        }
    }
}
