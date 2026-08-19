package p017Af;

import android.app.Activity;
import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import androidx.constraintlayout.widget.ConstraintLayout;
import cd.C11709i;
import com.google.android.material.textfield.TextInputLayout;
import ge.C14035K;
import ge.C14111x0;
import ie.C14972a;
import ie.C14973b;
import ie.C14974c;
import ie.C14975d;
import io.sentry.internal.debugmeta.C15384c;
import java.io.File;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16527D;
import mm.C17296C;
import mm.C17309l;
import mm.C17314q;
import ni.C17628b;
import ni.C17642p;
import p000.C14886i;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p025An.AbstractC0575H;
import p040Bd.C0901C1;
import p040Bd.C0954L0;
import p040Bd.C0960M0;
import p040Bd.C1011U4;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p069Cf.C1651j;
import p080D0.C1811j0;
import p1013t0.C19715c;
import p103Dn.C2127D0;
import p103Dn.InterfaceC2211v0;
import p1071w0.C20750g0;
import p1081wc.C20900s;
import p1081wc.C20902u;
import p1081wc.InterfaceC20904w;
import p1139z0.C21611e;
import p1155zi.C21958S;
import p1155zi.EnumC21973X;
import p1155zi.EnumC21974X0;
import p117Eb.C2392v;
import p144Fe.AbstractC2721a;
import p144Fe.AbstractC2722b;
import p153Fn.C2925c;
import p178H.C3123P;
import p195Hh.C3430e;
import p225Im.InterfaceC3759g;
import p229J0.C3880A3;
import p229J0.C4044e2;
import p229J0.C4050f2;
import p229J0.C4056g2;
import p229J0.C4158x2;
import p229J0.DialogC4038d2;
import p229J0.EnumC3886B3;
import p290Ld.C5003f;
import p349O0.InterfaceC5985X;
import p350O1.C6065n;
import p350O1.C6067p;
import p372P3.C6337s;
import p492U1.EnumC7546k;
import p507Uh.C7681g;
import p507Uh.InterfaceC7678d;
import p507Uh.InterfaceC7682h;
import p523V9.AbstractC8160o6;
import p544W9.AbstractC8614c3;
import p547Wc.C8797h0;
import p547Wc.C8804n;
import p553Wh.C8870f;
import p587Y1.C9588n;
import p587Y1.DialogC9590p;
import p593Y8.C9683j;
import p594Y9.AbstractC9842Z;
import p658b5.C11232c;
import p695d3.C12999d;
import p737f1.C13522n;
import p758g0.C13732H;
import p758g0.C13733I;
import p758g0.C13756d;
import p758g0.C13757d0;
import p801i5.AbstractC14929a;
import p860l0.C16782u;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p948pi.C18418a;

/* JADX INFO: renamed from: Af.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C0494y extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1614Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f1615Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f1616o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f1617p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f1618q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0494y(Context context, C2925c c2925c, C3123P c3123p, InterfaceC1436k interfaceC1436k) {
        super(0);
        this.f1614Y = 2;
        this.f1617p0 = context;
        this.f1616o0 = c2925c;
        this.f1618q0 = c3123p;
        this.f1615Z = interfaceC1436k;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0218  */
    /* JADX WARN: Code duplicated, block: B:83:0x028e  */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, java.util.Map] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        int i10;
        InterfaceC2211v0 interfaceC2211v0M21948i;
        int i11 = 4;
        C17296C c17296c = C17296C.f55119a;
        Object obj = this.f1618q0;
        Object obj2 = this.f1616o0;
        Object obj3 = this.f1615Z;
        Object obj4 = this.f1617p0;
        switch (this.f1614Y) {
            case 0:
                ((InterfaceC1436k) obj3).invoke(((C0954L0) obj4).f2715c);
                ((InterfaceC1439n) obj2).invoke((C0960M0) obj, 0);
                return c17296c;
            case 1:
                ((InterfaceC1436k) obj3).invoke((String) obj4);
                ((InterfaceC1439n) obj2).invoke((C0901C1) obj, null);
                return c17296c;
            case 2:
                ContentResolver contentResolver = ((Context) obj4).getContentResolver();
                Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", AbstractC0168G.m533v("chatgpt-", System.currentTimeMillis(), ".jpg"));
                contentValues.put("mime_type", "image/jpeg");
                contentValues.put("relative_path", "Pictures/ChatGPT");
                AbstractC0575H.m1156D((C2925c) obj2, null, null, new C14886i((C3123P) obj, new C2392v((File) null, contentResolver, uri, contentValues), (Context) obj4, (InterfaceC1436k) obj3, null), 3);
                return c17296c;
            case 3:
                ((InterfaceC1436k) obj3).invoke((C1011U4) obj4);
                AbstractC0575H.m1156D((C2925c) obj2, null, null, new C1651j((C19715c) obj, null), 3);
                return c17296c;
            case 4:
                InterfaceC7678d interfaceC7678d = (InterfaceC7678d) obj3;
                if (AbstractC9842Z.m10490b(interfaceC7678d.mo3586a())) {
                    ((InterfaceC5985X) obj).setValue(Boolean.TRUE);
                } else {
                    InterfaceC7682h interfaceC7682hMo3586a = interfaceC7678d.mo3586a();
                    AbstractC16544l.m18094g(interfaceC7682hMo3586a, "<this>");
                    if (interfaceC7682hMo3586a.equals(C7681g.f24220a)) {
                        ((InterfaceC1426a) obj4).invoke();
                        ((C11709i) obj2).m13031a();
                    } else {
                        interfaceC7678d.mo3587b();
                    }
                }
                return c17296c;
            case 5:
                C3880A3 c3880a3 = (C3880A3) obj3;
                C2925c c2925c = (C2925c) obj4;
                if (c3880a3.m4602b() != EnumC3886B3.f11778Z) {
                    AbstractC0575H.m1156D(c2925c, null, null, new C4056g2(c3880a3, null), 3).mo1271H0(new C1811j0(i11, (InterfaceC1426a) obj));
                } else if (c3880a3.f11737c.m12638h().f15815a.containsKey(EnumC3886B3.f11779o0)) {
                    AbstractC0575H.m1156D(c2925c, null, null, new C4044e2((C13756d) obj2, null), 3);
                    AbstractC0575H.m1156D(c2925c, null, null, new C4050f2(c3880a3, null), 3);
                } else {
                    AbstractC0575H.m1156D(c2925c, null, null, new C4056g2(c3880a3, null), 3).mo1271H0(new C1811j0(i11, (InterfaceC1426a) obj));
                }
                return c17296c;
            case 6:
                ((DialogC4038d2) obj3).m4730e((InterfaceC1426a) obj4, (C4158x2) obj2, (EnumC7546k) obj);
                return c17296c;
            case 7:
                AbstractC0575H.m1156D((C2925c) obj3, null, null, new C8797h0((C16782u) obj4, (InterfaceC1426a) obj2, (InterfaceC5985X) obj, null), 3);
                return c17296c;
            case 8:
                ((DialogC9590p) obj3).m10135f((InterfaceC1426a) obj4, (C9588n) obj2, (EnumC7546k) obj);
                return c17296c;
            case 9:
                String str = (String) obj3;
                if (str == null) {
                    throw new NullPointerException("Name is null");
                }
                if (str.equals("ACTIVITY")) {
                    i10 = 1;
                } else if (str.equals("BROADCAST")) {
                    i10 = 2;
                } else if (str.equals("SERVICE")) {
                    i10 = 3;
                } else if (str.equals("FOREGROUND_SERVICE")) {
                    i10 = 4;
                } else {
                    if (!str.equals("CALLBACK")) {
                        throw new IllegalArgumentException("No enum constant androidx.glance.appwidget.action.ActionTrampolineType.".concat(str));
                    }
                    i10 = 5;
                }
                int iM24h = AbstractC0010F.m24h(i10);
                Intent intent = (Intent) obj2;
                Activity activity = (Activity) obj4;
                if (iM24h == 0) {
                    activity.startActivity(intent, (Bundle) obj);
                } else if (iM24h == 1) {
                    activity.sendBroadcast(intent);
                } else if (iM24h == 2) {
                    activity.startService(intent);
                } else if (iM24h != 3) {
                    if (iM24h == 4) {
                        activity.sendBroadcast(intent);
                    }
                } else if (Build.VERSION.SDK_INT >= 26) {
                    C12999d.f41253a.m14729a(activity, intent);
                } else {
                    activity.startService(intent);
                }
                return c17296c;
            case 10:
                ((InterfaceC20904w) obj3).mo21447a(C20902u.f66624e, AbstractC17659D.m19244f(new C17309l("location", "popup_description"), new C17309l("type", ((C21958S) obj4).f69519a), new C17309l("action", ((EnumC21973X) obj2).f69554Y)));
                ((InterfaceC1426a) obj).invoke();
                return c17296c;
            case 11:
                C13733I c13733i = (C13733I) obj4;
                Number number = (Number) obj3;
                Number number2 = (Number) obj2;
                if (!number.equals(c13733i.f43304Y) || !number2.equals(c13733i.f43305Z)) {
                    c13733i.f43304Y = number;
                    c13733i.f43305Z = number2;
                    c13733i.f43308q0 = new C13757d0((C13732H) obj, c13733i.f43306o0, number, number2, null);
                    c13733i.f43312u0.f43320b.setValue(Boolean.TRUE);
                    c13733i.f43309r0 = false;
                    c13733i.f43310s0 = true;
                }
                return c17296c;
            case 12:
                ((InterfaceC1426a) obj3).invoke();
                C20900s c20900s = C20900s.f66621e;
                boolean z6 = ((C14111x0) obj2).f44380K;
                ((InterfaceC20904w) obj4).mo21447a(c20900s, AbstractC17660E.m19258c(new C17309l("is_temporary", Boolean.valueOf(!z6))));
                ((InterfaceC1436k) ((InterfaceC3759g) obj)).invoke(new C14035K(!z6));
                return c17296c;
            case 13:
                Boolean bool = Boolean.FALSE;
                ((InterfaceC5985X) obj4).setValue(bool);
                ((InterfaceC5985X) obj2).setValue(bool);
                ((InterfaceC5985X) obj).setValue(bool);
                ((InterfaceC1426a) obj3).invoke();
                return c17296c;
            case 14:
                C14975d c14975d = (C14975d) obj3;
                C3430e c3430e = c14975d.f46631b;
                C17314q c17314q = c14975d.f46632c;
                AbstractC8160o6.m8726a(c3430e, "Creating database " + ((String) c17314q.getValue()), null, 6);
                C16527D c16527d = AbstractC16526C.f51263a;
                c16527d.mo5693b(C5003f.class);
                C6337s c6337s = new C6337s(3);
                String str2 = (String) c17314q.getValue();
                c16527d.mo5693b(C5003f.class);
                Application application = (Application) obj4;
                C9683j c9683j = new C9683j(c6337s, application, str2, null, new C14974c(new C6337s(3), new AbstractC14929a[0]), 232);
                ((C17628b) obj2).m19237b(new C14972a(c14975d, c9683j, null));
                ((C17642p) obj).m19237b(new C14973b(c14975d, application, null));
                C11232c DBConversationAdapter = AbstractC2721a.f8363a;
                C15384c DBMessageAdapter = AbstractC2722b.f8364a;
                AbstractC16544l.m18094g(DBConversationAdapter, "DBConversationAdapter");
                AbstractC16544l.m18094g(DBMessageAdapter, "DBMessageAdapter");
                c16527d.mo5693b(C5003f.class);
                return new C5003f(c9683j, DBConversationAdapter, DBMessageAdapter);
            case 15:
                AbstractC8614c3.m9262a((C18418a) obj4, (C8870f) obj2, EnumC21974X0.f69560t0, new C8804n((InterfaceC1436k) obj3, (InterfaceC1426a) obj, 3));
                return c17296c;
            case 16:
                Boolean bool2 = Boolean.FALSE;
                ((InterfaceC5985X) obj4).setValue(bool2);
                ((InterfaceC5985X) obj2).setValue(bool2);
                ((InterfaceC5985X) obj).setValue(bool2);
                ((C11709i) obj3).m13031a();
                return c17296c;
            case 17:
                ((TextInputLayout) obj3).setVisibility(8);
                ((TextInputLayout) obj4).setVisibility(8);
                ((ConstraintLayout) obj2).setVisibility(8);
                ((ConstraintLayout) obj).setVisibility(8);
                return c17296c;
            default:
                if (!((C20750g0) obj3).m21292b()) {
                    ((C13522n) obj4).m15073b();
                }
                int i12 = ((C6065n) obj2).f19759d;
                if (!C6067p.m6643a(i12, 7) && !C6067p.m6643a(i12, 8) && (interfaceC2211v0M21948i = ((C21611e) obj).m21948i()) != null) {
                    ((C2127D0) interfaceC2211v0M21948i).mo3231f(c17296c);
                }
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0494y(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(0);
        this.f1614Y = i10;
        this.f1615Z = obj;
        this.f1617p0 = obj2;
        this.f1616o0 = obj3;
        this.f1618q0 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0494y(C18418a c18418a, C8870f c8870f, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a) {
        super(0);
        this.f1614Y = 15;
        this.f1617p0 = c18418a;
        this.f1616o0 = c8870f;
        this.f1615Z = interfaceC1436k;
        this.f1618q0 = interfaceC1426a;
    }
}
