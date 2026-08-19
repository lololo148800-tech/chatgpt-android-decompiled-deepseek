package p458Si;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p001A.AbstractC0010F;
import p025An.AbstractC0563B;
import p1114xp.C21346q;
import p1114xp.InterfaceC21347r;
import p167Gb.C3032c;
import p225Im.InterfaceC3756d;
import p228J.AbstractC3794B0;
import p432Rh.C6898k;
import p437Rn.C6949g;
import p530Vi.C8297E;
import p530Vi.C8304L;
import p530Vi.InterfaceC8294B;
import p547Wc.C8816z;
import p554Wi.C8875b;
import p571X9.AbstractC9233X;
import p646aj.C10624d;
import p646aj.C10627g;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17680n;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Si.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C7141c implements InterfaceC21347r, InterfaceC8294B {

    /* JADX INFO: renamed from: Y */
    public final C21346q f22713Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC0563B f22714Z;

    /* JADX INFO: renamed from: o0 */
    public final SharedPreferences f22715o0;

    /* JADX INFO: renamed from: p0 */
    public final C10627g f22716p0;

    public C7141c(Context context, C21346q store, String writeKey, AbstractC0563B ioDispatcher) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(store, "store");
        AbstractC16544l.m18094g(writeKey, "writeKey");
        AbstractC16544l.m18094g(ioDispatcher, "ioDispatcher");
        this.f22713Y = store;
        this.f22714Z = ioDispatcher;
        SharedPreferences sharedPreferences = context.getSharedPreferences("analytics-android-".concat(writeKey), 0);
        AbstractC16544l.m18093f(sharedPreferences, "context.getSharedPrefere…y\", Context.MODE_PRIVATE)");
        this.f22715o0 = sharedPreferences;
        File dir = context.getDir("segment-disk-queue", 0);
        AbstractC16544l.m18093f(dir, "context.getDir(directory…e\", Context.MODE_PRIVATE)");
        this.f22716p0 = new C10627g(dir, writeKey, new C3032c(sharedPreferences, 22), null);
    }

    @Override // p530Vi.InterfaceC8294B
    /* JADX INFO: renamed from: a */
    public final Object mo7524a(int i10, String str, AbstractC19687c abstractC19687c) throws Exception {
        int i11 = AbstractC7139a.f22708a[AbstractC0010F.m24h(i10)];
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 1) {
            this.f22715o0.edit().putString(AbstractC3794B0.m4491p(i10), str).apply();
            return c17296c;
        }
        if (str.length() >= 32000) {
            throw new Exception("enqueued payload is too large");
        }
        C10627g c10627g = this.f22716p0;
        c10627g.getClass();
        Object objM10997c = c10627g.m10997c(new C8816z(c10627g, 14, str), abstractC19687c);
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        if (objM10997c != enumC19250a) {
            objM10997c = c17296c;
        }
        return objM10997c == enumC19250a ? objM10997c : c17296c;
    }

    @Override // p530Vi.InterfaceC8294B
    /* JADX INFO: renamed from: b */
    public final String mo7525b(int i10) {
        AbstractC14376f.m15825D(i10, SubscriberAttributeKt.JSON_NAME_KEY);
        int iM24h = AbstractC0010F.m24h(i10);
        if (iM24h != 4) {
            String strM4491p = AbstractC3794B0.m4491p(i10);
            SharedPreferences sharedPreferences = this.f22715o0;
            if (iM24h != 7) {
                return sharedPreferences.getString(strM4491p, null);
            }
            int i11 = sharedPreferences.getInt(strM4491p, -1);
            if (i11 != -1) {
                return String.valueOf(i11);
            }
            return null;
        }
        C10627g c10627g = this.f22716p0;
        c10627g.getClass();
        File[] fileArrListFiles = c10627g.f31532a.listFiles(new C10624d(c10627g, 0));
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            arrayList.add(file.getAbsolutePath());
        }
        return AbstractC17680n.m19349Y(arrayList, null, null, null, 0, null, null, 63);
    }

    @Override // p530Vi.InterfaceC8294B
    /* JADX INFO: renamed from: c */
    public final Object mo7526c(C8875b c8875b) {
        C10627g c10627g = this.f22716p0;
        c10627g.getClass();
        Object objM10997c = c10627g.m10997c(new C6949g(c10627g, 21), c8875b);
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        C17296C c17296c = C17296C.f55119a;
        if (objM10997c != enumC19250a) {
            objM10997c = c17296c;
        }
        return objM10997c == enumC19250a ? objM10997c : c17296c;
    }

    @Override // p530Vi.InterfaceC8294B
    /* JADX INFO: renamed from: d */
    public final boolean mo7527d(String str) {
        this.f22716p0.getClass();
        return new File(str).delete();
    }

    @Override // p530Vi.InterfaceC8294B
    public final void remove(int i10) {
        AbstractC14376f.m15825D(i10, SubscriberAttributeKt.JSON_NAME_KEY);
        if (AbstractC7139a.f22708a[AbstractC0010F.m24h(i10)] == 1) {
            return;
        }
        this.f22715o0.edit().putString(AbstractC3794B0.m4491p(i10), null).apply();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // p530Vi.InterfaceC8294B
    /* JADX INFO: renamed from: e */
    public final Object mo7528e(AbstractC19687c abstractC19687c) {
        C7140b c7140b;
        C7141c c7141c;
        if (abstractC19687c instanceof C7140b) {
            c7140b = (C7140b) abstractC19687c;
            int i10 = c7140b.f22712p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c7140b.f22712p0 = i10 - Integer.MIN_VALUE;
            } else {
                c7140b = new C7140b(this, abstractC19687c);
            }
        } else {
            c7140b = new C7140b(this, abstractC19687c);
        }
        C7140b c7140b2 = c7140b;
        Object obj = c7140b2.f22710Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c7140b2.f22712p0;
        if (i11 != 0) {
            if (i11 == 1) {
                C7141c c7141c2 = c7140b2.f22709Y;
                AbstractC9233X.m9807c(obj);
                c7141c = c7141c2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C6898k c6898k = new C6898k(2, this, C7141c.class, "userInfoUpdate", "userInfoUpdate(Lcom/segment/analytics/kotlin/core/UserInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1);
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C8304L.class);
        c7140b2.f22709Y = this;
        c7140b2.f22712p0 = 1;
        if (this.f22713Y.m21744f(this, interfaceC3756dMo5693b, true, this.f22714Z, c6898k, c7140b2) == enumC19250a) {
            return enumC19250a;
        }
        c7141c = this;
        C21346q c21346q = c7141c.f22713Y;
        C6898k c6898k2 = new C6898k(2, c7141c, C7141c.class, "systemUpdate", lZYtIbClQJm.htUxkKMoMsz, 0, 2);
        InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(C8297E.class);
        c7140b2.f22709Y = null;
        c7140b2.f22712p0 = 2;
        if (c21346q.m21744f(c7141c, interfaceC3756dMo5693b2, true, c7141c.f22714Z, c6898k2, c7140b2) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
