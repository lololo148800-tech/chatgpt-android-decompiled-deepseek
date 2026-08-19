package p002A0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.compose.material.ripple.RippleNode;
import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import com.openai.chatgpt.R;
import io.livekit.android.room.C15102a;
import io.sentry.C15524y1;
import io.sentry.instrumentation.file.C15379d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16556x;
import kotlin.jvm.internal.C16558z;
import livekit.LivekitRtc$SignalRequest;
import livekit.LivekitRtc$UpdateLocalAudioTrack;
import mm.C17296C;
import mm.C17309l;
import mm.C17312o;
import mm.C17314q;
import p005A3.C0326m;
import p020Ai.C0515d;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p032B4.C0806a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p072Ci.EnumC1702g;
import p080D0.C1790Y;
import p086D6.C1958b;
import p086D6.C1961e;
import p086D6.C1964h;
import p086D6.C1969m;
import p101Dl.InterfaceC2111l;
import p103Dn.C2139J0;
import p103Dn.C2148O;
import p103Dn.C2169a0;
import p103Dn.C2201q0;
import p103Dn.EnumC2131F0;
import p103Dn.InterfaceC2186j;
import p1113xn.AbstractC21322p;
import p1113xn.C21319m;
import p112E6.C2344c;
import p1140z1.AbstractC21690f;
import p1155zi.C22050r;
import p125Ej.C2557a;
import p125Ej.C2561e;
import p125Ej.C2565i;
import p125Ej.C2567k;
import p168Gd.C3034b;
import p193Hf.C3298B0;
import p193Hf.C3372i1;
import p193Hf.C3375j1;
import p193Hf.C3408u1;
import p193Hf.C3414w1;
import p193Hf.InterfaceC3378k1;
import p203I0.AbstractC3569z;
import p203I0.C3544a;
import p203I0.C3551h;
import p203I0.C3561r;
import p203I0.C3563t;
import p209I6.C3638p;
import p209I6.C3639q;
import p229J0.C4148v4;
import p235J6.InterfaceC4267d;
import p268Kf.C4648c;
import p268Kf.C4666u;
import p273Kl.C4750V0;
import p324Mn.C5551u;
import p344Nl.C5820B;
import p344Nl.C5842n;
import p360Od.C6172d;
import p360Od.EnumC6170b;
import p364Oh.C6232f;
import p385Pj.C6431f;
import p385Pj.C6432g;
import p385Pj.C6434i;
import p385Pj.C6435j;
import p385Pj.C6439n;
import p385Pj.C6440o;
import p385Pj.C6441p;
import p385Pj.C6445t;
import p385Pj.EnumC6437l;
import p387Pl.AbstractC6470Q;
import p387Pl.C6484d;
import p387Pl.C6486f;
import p387Pl.C6487g;
import p387Pl.C6488h;
import p387Pl.C6497q;
import p403Qd.C6617X;
import p432Rh.C6888a;
import p479Td.C7320F;
import p479Td.C7336W;
import p479Td.C7351f0;
import p479Td.C7369t;
import p479Td.C7370u;
import p508Uj.AbstractC7701i;
import p508Uj.C7705m;
import p508Uj.C7707o;
import p523V9.AbstractC7934L5;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8146n0;
import p523V9.AbstractC8160o6;
import p544W9.AbstractC8752z3;
import p566X4.AbstractC9045c;
import p566X4.InterfaceC9047e;
import p571X9.AbstractC9138H;
import p571X9.AbstractC9233X;
import p575Xd.C9440I;
import p575Xd.C9463v;
import p647ak.AbstractC10661P;
import p647ak.AbstractC10729t;
import p647ak.C10631A;
import p647ak.C10637D;
import p647ak.C10639E;
import p647ak.C10643G;
import p647ak.C10645H;
import p647ak.C10725r;
import p647ak.C10731u;
import p647ak.C10733v;
import p647ak.C10735w;
import p647ak.C10737x;
import p647ak.C10741z;
import p647ak.EnumC10647I;
import p647ak.EnumC10721p;
import p647ak.EnumC10723q;
import p658b5.C11245p;
import p708dh.C13139Q;
import p708dh.C13140S;
import p708dh.C13164r;
import p708dh.C13166t;
import p758g0.C13756d;
import p759g1.C13800b;
import p774h1.C14365u;
import p793ho.C14587G4;
import p793ho.C14720c4;
import p793ho.EnumC14679W1;
import p894n0.C17408n;
import p894n0.C17409o;
import p894n0.C17410p;
import p894n0.InterfaceC17405k;
import p894n0.InterfaceC17411q;
import p900n6.C17509f;
import p917o6.C17852e;
import p917o6.C17853f;
import p949pj.AbstractC18478m0;
import p949pj.C18440M;
import p949pj.C18447U;
import p949pj.C18452Z;
import p949pj.C18472j0;
import p949pj.InterfaceC18449W;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import ye.C21514c;
import ye.C21522k;
import ye.C21523l;
import ye.EnumC21524m;

/* JADX INFO: renamed from: A0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0132i implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f548Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f549Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f550o0;

    public /* synthetic */ C0132i(Object obj, int i10, Object obj2) {
        this.f548Y = i10;
        this.f550o0 = obj;
        this.f549Z = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1 A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    private final Object m433d(Object obj, InterfaceC18770c interfaceC18770c) {
        Object objMo395a;
        MimeTypeMap mimeTypeMap;
        File externalFilesDir;
        Object absolutePath;
        List<Uri> list = (List) obj;
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        C6445t c6445t = (C6445t) this.f550o0;
        ContentResolver contentResolver = c6445t.f20912c.getContentResolver();
        boolean zIsEmpty = list.isEmpty();
        C17296C c17296c = C17296C.f55119a;
        InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f549Z;
        if (zIsEmpty) {
            objMo395a = interfaceC2186j.mo395a(C6439n.f20903a, interfaceC18770c);
            if (objMo395a != EnumC19250a.f61036Y) {
                return c17296c;
            }
        } else {
            ArrayList arrayList = new ArrayList();
            EnumC6437l enumC6437l = null;
            for (Uri uri : list) {
                try {
                    String extensionFromMimeType = singleton.getExtensionFromMimeType(contentResolver.getType(uri));
                    String str = new SimpleDateFormat("yyyy-MM-dd'T'HH-mm-ss.SSSZZZZZ", Locale.getDefault()).format(new Date());
                    externalFilesDir = c6445t.f20912c.getExternalFilesDir("");
                    mimeTypeMap = singleton;
                    try {
                        File file = new File(externalFilesDir, str + "_" + c6445t.f20914e + "_document_upload_" + UUID.randomUUID() + Separators.DOT + extensionFromMimeType);
                        c6445t.f20914e = c6445t.f20914e + 1;
                        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException();
                        }
                        C15379d c15379dM9509d = AbstractC8752z3.m9509d(new FileOutputStream(file), file);
                        try {
                            AbstractC7934L5.m8227a(inputStreamOpenInputStream, c15379dM9509d);
                            externalFilesDir = null;
                            try {
                                AbstractC7942M5.m8232a(inputStreamOpenInputStream, null);
                                try {
                                    AbstractC7942M5.m8232a(c15379dM9509d, null);
                                    absolutePath = file.getAbsolutePath();
                                } catch (FileNotFoundException unused) {
                                    enumC6437l = EnumC6437l.f20898Y;
                                    absolutePath = externalFilesDir;
                                } catch (SecurityException unused2) {
                                    enumC6437l = EnumC6437l.f20899Z;
                                    absolutePath = externalFilesDir;
                                }
                                if (absolutePath != null) {
                                    arrayList.add(absolutePath);
                                }
                                singleton = mimeTypeMap;
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    AbstractC7942M5.m8232a(c15379dM9509d, th2);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            externalFilesDir = null;
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                AbstractC7942M5.m8232a(inputStreamOpenInputStream, th4);
                                throw th5;
                            }
                        }
                    } catch (FileNotFoundException unused3) {
                        externalFilesDir = null;
                    } catch (SecurityException unused4) {
                        externalFilesDir = null;
                        enumC6437l = EnumC6437l.f20899Z;
                        absolutePath = externalFilesDir;
                        if (absolutePath != null) {
                            arrayList.add(absolutePath);
                        }
                        singleton = mimeTypeMap;
                    }
                } catch (FileNotFoundException unused5) {
                    mimeTypeMap = singleton;
                } catch (SecurityException unused6) {
                    mimeTypeMap = singleton;
                }
                enumC6437l = EnumC6437l.f20898Y;
                absolutePath = externalFilesDir;
                if (absolutePath != null) {
                    arrayList.add(absolutePath);
                }
                singleton = mimeTypeMap;
            }
            if (enumC6437l == null) {
                objMo395a = interfaceC2186j.mo395a(new C6441p(arrayList), interfaceC18770c);
                if (objMo395a != EnumC19250a.f61036Y) {
                    return c17296c;
                }
            } else {
                objMo395a = interfaceC2186j.mo395a(new C6440o(arrayList, enumC6437l), interfaceC18770c);
                if (objMo395a != EnumC19250a.f61036Y) {
                    return c17296c;
                }
            }
        }
        return objMo395a;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    /* JADX WARN: Code duplicated, block: B:53:0x010a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    private final Object m434g(Object obj, InterfaceC18770c interfaceC18770c) {
        C10741z c10741z;
        InterfaceC2186j interfaceC2186j;
        Object c10737x;
        InterfaceC2186j interfaceC2186j2;
        Object c10737x2;
        Object objM9806b;
        if (interfaceC18770c instanceof C10741z) {
            c10741z = (C10741z) interfaceC18770c;
            int i10 = c10741z.f31916Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c10741z.f31916Z = i10 - Integer.MIN_VALUE;
            } else {
                c10741z = new C10741z(this, interfaceC18770c);
            }
        } else {
            c10741z = new C10741z(this, interfaceC18770c);
        }
        Object obj2 = c10741z.f31915Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c10741z.f31916Z;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC2186j2 = c10741z.f31917o0;
                AbstractC9233X.m9807c(obj2);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj2);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj2);
        Object obj3 = ((C17312o) obj).f55139Y;
        Throwable thM18979a = C17312o.m18979a(obj3);
        C10631A c10631a = (C10631A) this.f549Z;
        interfaceC2186j = (InterfaceC2186j) this.f550o0;
        if (thM18979a == null) {
            AbstractC18478m0 abstractC18478m0 = (AbstractC18478m0) obj3;
            if (AbstractC10661P.m11005b(abstractC18478m0) == c10631a.f31545d) {
                Context context = c10631a.f31543b;
                AbstractC16544l.m18094g(context, "context");
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    File file = new File(context.getCacheDir(), "persona_selfie_" + jCurrentTimeMillis + ".jpg");
                    Bitmap bitmap = abstractC18478m0.f58922a;
                    C15379d c15379dM9509d = AbstractC8752z3.m9509d(new FileOutputStream(file), file);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, c15379dM9509d);
                        AbstractC7942M5.m8232a(c15379dM9509d, null);
                        String absolutePath = file.getAbsolutePath();
                        EnumC10723q enumC10723qM11005b = AbstractC10661P.m11005b(abstractC18478m0);
                        EnumC10721p enumC10721p = EnumC10721p.AUTO;
                        AbstractC16544l.m18091d(absolutePath);
                        objM9806b = new C10725r(absolutePath, enumC10721p, enumC10723qM11005b, jCurrentTimeMillis);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            AbstractC7942M5.m8232a(c15379dM9509d, th2);
                            throw th3;
                        }
                    }
                } catch (IOException e10) {
                    objM9806b = AbstractC9233X.m9806b(e10);
                }
                Throwable thM18979a2 = C17312o.m18979a(objM9806b);
                if (thM18979a2 == null) {
                    c10737x2 = new C10733v((AbstractC10729t) objM9806b);
                } else {
                    c10737x = new C10735w(thM18979a2);
                }
            } else {
                c10737x2 = new C10737x(EnumC10647I.f31589r0);
            }
            if (c10737x2 != null) {
                c10741z.f31917o0 = null;
                c10741z.f31916Z = 2;
                if (interfaceC2186j.mo395a(c10737x2, c10741z) == enumC19250a) {
                    return enumC19250a;
                }
            }
            return C17296C.f55119a;
        }
        if (thM18979a instanceof C18452Z) {
            int i12 = c10631a.f31546e + 1;
            c10631a.f31546e = i12;
            if (i12 >= 6) {
                c10737x = C10731u.f31907a;
            } else {
                c10741z.f31917o0 = interfaceC2186j;
                c10741z.f31916Z = 1;
                if (AbstractC0575H.m1184m(500L, c10741z) == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC2186j2 = interfaceC2186j;
            }
        } else {
            c10737x = new C10737x(AbstractC8146n0.m8687d(thM18979a));
        }
        c10737x2 = c10737x;
        if (c10737x2 != null) {
            c10741z.f31917o0 = null;
            c10741z.f31916Z = 2;
            if (interfaceC2186j.mo395a(c10737x2, c10741z) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
        interfaceC2186j = interfaceC2186j2;
        c10737x = null;
        c10737x2 = c10737x;
        if (c10737x2 != null) {
            c10741z.f31917o0 = null;
            c10741z.f31916Z = 2;
            if (interfaceC2186j.mo395a(c10737x2, c10741z) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:154:0x028e  */
    /* JADX WARN: Code duplicated, block: B:176:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:194:0x0383  */
    /* JADX WARN: Code duplicated, block: B:239:0x0431  */
    /* JADX WARN: Code duplicated, block: B:257:0x0473  */
    /* JADX WARN: Code duplicated, block: B:307:0x057c  */
    /* JADX WARN: Code duplicated, block: B:38:0x008b  */
    /* JADX WARN: Code duplicated, block: B:409:0x072f  */
    /* JADX WARN: Code duplicated, block: B:411:0x073a  */
    /* JADX WARN: Code duplicated, block: B:418:0x074d  */
    /* JADX WARN: Code duplicated, block: B:459:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:474:0x0824  */
    /* JADX WARN: Code duplicated, block: B:497:0x087f  */
    /* JADX WARN: Code duplicated, block: B:520:0x08da  */
    /* JADX WARN: Code duplicated, block: B:539:0x091e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00de  */
    /* JADX WARN: Code duplicated, block: B:562:0x0979  */
    /* JADX WARN: Code duplicated, block: B:623:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0119  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r13v0, types: [Bm.n, java.lang.Object] */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) throws FileNotFoundException {
        C1958b c1958b;
        C1969m c1969m;
        InterfaceC2186j interfaceC2186j;
        InterfaceC2186j interfaceC2186j2;
        C2148O c2148o;
        C2169a0 c2169a0;
        InterfaceC2186j interfaceC2186j3;
        InterfaceC2186j interfaceC2186j4;
        C2201q0 c2201q0;
        InterfaceC2186j interfaceC2186j5;
        Object objMo395a;
        Object c2557a;
        C3298B0 c3298b0;
        C3408u1 c3408u1;
        C21522k c21522k;
        C21522k c21522k2;
        Iterator it;
        String str;
        C21522k c21522k3;
        C21522k c21522k4;
        Iterator it2;
        String str2;
        C3375j1 c3375j1;
        String strM21665e;
        C21319m c21319m;
        C3638p c3638p;
        C3639q c3639q;
        C4648c c4648c;
        C9440I c9440i;
        C5820B c5820b;
        C6232f c6232f;
        InterfaceC2186j interfaceC2186j6;
        C6434i c6434i;
        Object c6432g;
        C6486f c6486f;
        C10643G c10643g;
        C10637D c10637d;
        Object obj2;
        C13140S c13140s;
        Boolean boolValueOf;
        Object obj3 = obj;
        String str3 = "";
        boolean z6 = false;
        C21523l c21523l = null;
        c9463v = null;
        C9463v c9463v = null;
        C17296C c17296c = C17296C.f55119a;
        Object obj4 = this.f550o0;
        ?? r13 = this.f549Z;
        switch (this.f548Y) {
            case 0:
                long j10 = ((C13800b) obj3).f43584a;
                C0134k c0134k = (C0134k) obj4;
                boolean zM8538d = AbstractC8088f6.m8538d(((C13800b) c0134k.f559G0.m15224e()).f43584a);
                C13756d c13756d = c0134k.f559G0;
                if (zM8538d && AbstractC8088f6.m8538d(j10) && C13800b.m15307h(((C13800b) c13756d.m15224e()).f43584a) != C13800b.m15307h(j10)) {
                    AbstractC0575H.m1156D((InterfaceC0571F) r13, null, null, new C0131h(c0134k, j10, null), 3);
                    return c17296c;
                }
                Object objM15226g = c13756d.m15226g(new C13800b(j10), interfaceC18770c);
                return objM15226g == EnumC19250a.f61036Y ? objM15226g : c17296c;
            case 1:
                long j11 = ((C13800b) obj3).f43584a;
                C13756d c13756d2 = (C13756d) obj4;
                if (AbstractC8088f6.m8538d(((C13800b) c13756d2.m15224e()).f43584a) && AbstractC8088f6.m8538d(j11) && C13800b.m15307h(((C13800b) c13756d2.m15224e()).f43584a) != C13800b.m15307h(j11)) {
                    AbstractC0575H.m1156D((InterfaceC0571F) r13, null, null, new C1790Y(c13756d2, j11, null), 3);
                    return c17296c;
                }
                Object objM15226g2 = c13756d2.m15226g(new C13800b(j11), interfaceC18770c);
                return objM15226g2 == EnumC19250a.f61036Y ? objM15226g2 : c17296c;
            case 2:
                if (interfaceC18770c instanceof C1958b) {
                    c1958b = (C1958b) interfaceC18770c;
                    int i10 = c1958b.f5793Z;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c1958b.f5793Z = i10 - Integer.MIN_VALUE;
                    } else {
                        c1958b = new C1958b(this, interfaceC18770c);
                    }
                } else {
                    c1958b = new C1958b(this, interfaceC18770c);
                }
                Object obj5 = c1958b.f5792Y;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = c1958b.f5793Z;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj5);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj5);
                ((C1961e) r13).getClass();
                C0806a c0806aM19598a = ((C17853f) obj3).m19598a();
                c0806aM19598a.m1842a(new C17509f());
                C17853f c17853fM1843b = c0806aM19598a.m1843b();
                c1958b.f5793Z = 1;
                return ((InterfaceC2186j) obj4).mo395a(c17853fM1843b, c1958b) == enumC19250a ? enumC19250a : c17296c;
            case 3:
                if (interfaceC18770c instanceof C1969m) {
                    c1969m = (C1969m) interfaceC18770c;
                    int i12 = c1969m.f5827Z;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c1969m.f5827Z = i12 - Integer.MIN_VALUE;
                    } else {
                        c1969m = new C1969m(this, interfaceC18770c);
                    }
                } else {
                    c1969m = new C1969m(this, interfaceC18770c);
                }
                Object obj6 = c1969m.f5826Y;
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i13 = c1969m.f5827Z;
                if (i13 == 0) {
                    AbstractC9233X.m9807c(obj6);
                    InterfaceC2186j interfaceC2186j7 = (InterfaceC2186j) obj4;
                    c1969m.f5828o0 = interfaceC2186j7;
                    c1969m.f5827Z = 1;
                    Object objInvoke = ((C1964h) r13).invoke(obj3, c1969m);
                    if (objInvoke != enumC19250a2) {
                        interfaceC2186j = null;
                        obj6 = objInvoke;
                        interfaceC2186j2 = interfaceC2186j7;
                    }
                    return enumC19250a2;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj6);
                    return c17296c;
                }
                interfaceC2186j2 = c1969m.f5828o0;
                AbstractC9233X.m9807c(obj6);
                interfaceC2186j = null;
                c1969m.f5828o0 = interfaceC2186j;
                c1969m.f5827Z = 2;
                if (interfaceC2186j2.mo395a(obj6, c1969m) != enumC19250a2) {
                    return c17296c;
                }
                return enumC19250a2;
            case 4:
                if (interfaceC18770c instanceof C2148O) {
                    c2148o = (C2148O) interfaceC18770c;
                    int i14 = c2148o.f6581o0;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2148o.f6581o0 = i14 - Integer.MIN_VALUE;
                    } else {
                        c2148o = new C2148O(this, interfaceC18770c);
                    }
                } else {
                    c2148o = new C2148O(this, interfaceC18770c);
                }
                Object obj7 = c2148o.f6579Y;
                EnumC19250a enumC19250a3 = EnumC19250a.f61036Y;
                int i15 = c2148o.f6581o0;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj7);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj7);
                C16558z c16558z = (C16558z) obj4;
                int i16 = c16558z.f51287Y;
                if (i16 >= 1) {
                    c2148o.f6581o0 = 1;
                    return ((InterfaceC2186j) r13).mo395a(obj3, c2148o) == enumC19250a3 ? enumC19250a3 : c17296c;
                }
                c16558z.f51287Y = i16 + 1;
                return c17296c;
            case 5:
                if (interfaceC18770c instanceof C2169a0) {
                    c2169a0 = (C2169a0) interfaceC18770c;
                    int i17 = c2169a0.f6648Z;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        c2169a0.f6648Z = i17 - Integer.MIN_VALUE;
                    } else {
                        c2169a0 = new C2169a0(this, interfaceC18770c);
                    }
                } else {
                    c2169a0 = new C2169a0(this, interfaceC18770c);
                }
                Object obj8 = c2169a0.f6647Y;
                EnumC19250a enumC19250a4 = EnumC19250a.f61036Y;
                int i18 = c2169a0.f6648Z;
                if (i18 == 0) {
                    AbstractC9233X.m9807c(obj8);
                    InterfaceC2186j interfaceC2186j8 = (InterfaceC2186j) obj4;
                    c2169a0.f6649o0 = interfaceC2186j8;
                    c2169a0.f6648Z = 1;
                    Object objInvoke2 = ((InterfaceC1439n) r13).invoke(obj3, c2169a0);
                    if (objInvoke2 != enumC19250a4) {
                        interfaceC2186j3 = null;
                        obj8 = objInvoke2;
                        interfaceC2186j4 = interfaceC2186j8;
                    }
                    return enumC19250a4;
                }
                if (i18 != 1) {
                    if (i18 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj8);
                    return c17296c;
                }
                interfaceC2186j4 = c2169a0.f6649o0;
                AbstractC9233X.m9807c(obj8);
                interfaceC2186j3 = null;
                c2169a0.f6649o0 = interfaceC2186j3;
                c2169a0.f6648Z = 2;
                if (interfaceC2186j4.mo395a(obj8, c2169a0) != enumC19250a4) {
                    return c17296c;
                }
                return enumC19250a4;
            case 6:
                if (interfaceC18770c instanceof C2201q0) {
                    c2201q0 = (C2201q0) interfaceC18770c;
                    int i19 = c2201q0.f6746Z;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        c2201q0.f6746Z = i19 - Integer.MIN_VALUE;
                    } else {
                        c2201q0 = new C2201q0(this, interfaceC18770c);
                    }
                } else {
                    c2201q0 = new C2201q0(this, interfaceC18770c);
                }
                Object obj9 = c2201q0.f6745Y;
                EnumC19250a enumC19250a5 = EnumC19250a.f61036Y;
                int i20 = c2201q0.f6746Z;
                if (i20 == 0) {
                    AbstractC9233X.m9807c(obj9);
                    c2201q0.f6748p0 = obj3;
                    interfaceC2186j5 = (InterfaceC2186j) obj4;
                    c2201q0.f6749q0 = interfaceC2186j5;
                    c2201q0.f6746Z = 1;
                    if (r13.invoke(obj3, c2201q0) != enumC19250a5) {
                    }
                    return enumC19250a5;
                }
                if (i20 != 1) {
                    if (i20 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj9);
                    return c17296c;
                }
                InterfaceC2186j interfaceC2186j9 = c2201q0.f6749q0;
                Object obj10 = c2201q0.f6748p0;
                AbstractC9233X.m9807c(obj9);
                interfaceC2186j5 = interfaceC2186j9;
                obj3 = obj10;
                c2201q0.f6748p0 = null;
                c2201q0.f6749q0 = null;
                c2201q0.f6746Z = 2;
                if (interfaceC2186j5.mo395a(obj3, c2201q0) != enumC19250a5) {
                    return c17296c;
                }
                return enumC19250a5;
            case 7:
                return m436b(((Number) obj3).intValue(), interfaceC18770c);
            case 8:
                Object obj11 = ((C17312o) obj3).f55139Y;
                InterfaceC2186j interfaceC2186j10 = (InterfaceC2186j) obj4;
                if (C17312o.m18979a(obj11) == null) {
                    InterfaceC18449W interfaceC18449W = (InterfaceC18449W) obj11;
                    ((C2561e) r13).getClass();
                    if (interfaceC18449W instanceof C18447U) {
                        c2557a = new C2557a(C2565i.f7997Y);
                    } else {
                        C18440M c18440mMo19877a = interfaceC18449W.mo19877a();
                        if (c18440mMo19877a != null) {
                            double d10 = c18440mMo19877a.f58831Z;
                            double d11 = c18440mMo19877a.f58832o0;
                            boolean z10 = d10 < 0.2d || d11 < 0.2d;
                            boolean z11 = d10 > 0.3d && d11 > 0.5d;
                            double d12 = c18440mMo19877a.f58830Y;
                            if ((d12 >= 0.34d || z11) && (d12 >= 0.45d || !z10)) {
                                c2557a = null;
                            } else {
                                c2557a = new C2557a(C2567k.f7999Y);
                            }
                        } else {
                            c2557a = null;
                        }
                    }
                    objMo395a = interfaceC2186j10.mo395a(c2557a, interfaceC18770c);
                    if (objMo395a != EnumC19250a.f61036Y) {
                        return c17296c;
                    }
                } else {
                    objMo395a = interfaceC2186j10.mo395a(null, interfaceC18770c);
                    if (objMo395a != EnumC19250a.f61036Y) {
                        return c17296c;
                    }
                }
                return objMo395a;
            case 9:
                if (interfaceC18770c instanceof C3298B0) {
                    c3298b0 = (C3298B0) interfaceC18770c;
                    int i21 = c3298b0.f10056Z;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        c3298b0.f10056Z = i21 - Integer.MIN_VALUE;
                    } else {
                        c3298b0 = new C3298B0(this, interfaceC18770c);
                    }
                } else {
                    c3298b0 = new C3298B0(this, interfaceC18770c);
                }
                Object obj12 = c3298b0.f10055Y;
                EnumC19250a enumC19250a6 = EnumC19250a.f61036Y;
                int i22 = c3298b0.f10056Z;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj12);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj12);
                if (!AbstractC16544l.m18089b(((C21514c) obj3).f68131a, ((C3034b) r13).f9128a)) {
                    return c17296c;
                }
                c3298b0.f10056Z = 1;
                return ((InterfaceC2186j) obj4).mo395a(obj3, c3298b0) == enumC19250a6 ? enumC19250a6 : c17296c;
            case 10:
                if (interfaceC18770c instanceof C3408u1) {
                    c3408u1 = (C3408u1) interfaceC18770c;
                    int i23 = c3408u1.f10385Z;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        c3408u1.f10385Z = i23 - Integer.MIN_VALUE;
                    } else {
                        c3408u1 = new C3408u1(this, interfaceC18770c);
                    }
                } else {
                    c3408u1 = new C3408u1(this, interfaceC18770c);
                }
                Object obj13 = c3408u1.f10384Y;
                EnumC19250a enumC19250a7 = EnumC19250a.f61036Y;
                int i24 = c3408u1.f10385Z;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj13);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj13);
                C17309l c17309l = (C17309l) obj3;
                List list = (List) c17309l.f55136Y;
                C21522k c21522k5 = (C21522k) c17309l.f55137Z;
                if (list != null) {
                    Iterator it3 = list.iterator();
                    C21522k c21522k6 = c21522k5;
                    while (it3.hasNext()) {
                        InterfaceC3378k1 interfaceC3378k1 = (InterfaceC3378k1) it3.next();
                        C3414w1 c3414w1 = (C3414w1) r13;
                        if (interfaceC3378k1 instanceof C3372i1) {
                            C3372i1 c3372i1 = (C3372i1) interfaceC3378k1;
                            c3414w1.getClass();
                            String str4 = c3372i1.f10298a;
                            C7370u c7370u = c3372i1.f10299b;
                            String str5 = ((C7369t) c7370u.f23371d.getValue()).f23366a;
                            String str6 = str5 == null ? str3 : str5;
                            C17314q c17314q = c7370u.f23371d;
                            String str7 = ((C7369t) c17314q.getValue()).f23368c;
                            C7320F c7320f = new C7320F(14, str7 == null ? str3 : str7, null, false, false);
                            String str8 = ((C7369t) c17314q.getValue()).f23367b;
                            String str9 = str8 == null ? str3 : str8;
                            C5551u.Companion.getClass();
                            c21522k4 = new C21522k(new C21523l(str4, 0, null, str6, str9, c7320f, C5551u.f18000Z, c3372i1.f10300c ? EnumC21524m.f68166p0 : EnumC21524m.f68163Y), c21522k6 != null ? c21522k6.f68153b : false, c21523l);
                        } else {
                            if (!(interfaceC3378k1 instanceof C3375j1)) {
                                throw new C0644w();
                            }
                            if (c21522k6 != null) {
                                C3375j1 c3375j2 = (C3375j1) interfaceC3378k1;
                                c3414w1.getClass();
                                c21522k4 = c21522k6;
                                for (C7336W c7336w : (List) c3375j2.f10305a.f23251d.getValue()) {
                                    String str10 = c7336w.f23241a;
                                    if (str10 == null || (strM21665e = c7336w.f23243c) == null) {
                                        it2 = it3;
                                        str2 = str3;
                                        c21522k5 = c21522k5;
                                        c3375j1 = c3375j2;
                                    } else {
                                        it2 = it3;
                                        try {
                                            C21523l c21523l2 = c21522k4.f68152a;
                                            str2 = str3;
                                            try {
                                                String str11 = c21523l2.f68160f.f23219c;
                                                if (!str10.equals(C15524y1.DEFAULT_PROPAGATION_TARGETS)) {
                                                    C21319m c21319m2 = c3414w1.f10401e;
                                                    if (c21319m2 != null) {
                                                        C21319m c21319m3 = c21319m2;
                                                        if (!str10.equals(c3414w1.f10402f)) {
                                                            c21319m3 = null;
                                                        }
                                                        if (c21319m3 == null) {
                                                            c21319m = new C21319m(str10);
                                                            c3414w1.f10402f = str10;
                                                            c3414w1.f10401e = c21319m;
                                                        } else {
                                                            c21319m = c21319m3;
                                                        }
                                                    } else {
                                                        c21319m = new C21319m(str10);
                                                        c3414w1.f10402f = str10;
                                                        c3414w1.f10401e = c21319m;
                                                    }
                                                    strM21665e = c21319m.m21665e(str11, strM21665e);
                                                }
                                                try {
                                                    c3375j1 = c3375j2;
                                                    try {
                                                        C21523l c21523lM21795a = C21523l.m21795a(c21522k4.f68152a, C7320F.m7776c(c21523l2.f68160f, strM21665e), c3375j2.f10306b ? EnumC21524m.f68166p0 : str10.equals(C15524y1.DEFAULT_PROPAGATION_TARGETS) ? EnumC21524m.f68164Z : EnumC21524m.f68165o0);
                                                        if (!str10.equals(C15524y1.DEFAULT_PROPAGATION_TARGETS)) {
                                                            c21523l2 = null;
                                                        }
                                                        c21522k4 = new C21522k(c21523lM21795a, c21522k4.f68153b, c21523l2);
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        AbstractC8160o6.m8731f(c3414w1.f10399c, "Failed to parse textdoc update content", e.getCause(), null, 4);
                                                    }
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    c3375j1 = c3375j2;
                                                    AbstractC8160o6.m8731f(c3414w1.f10399c, "Failed to parse textdoc update content", e.getCause(), null, 4);
                                                    it3 = it2;
                                                    c21522k5 = c21522k5;
                                                    str3 = str2;
                                                    c3375j2 = c3375j1;
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                c21522k5 = c21522k5;
                                                c3375j1 = c3375j2;
                                                AbstractC8160o6.m8731f(c3414w1.f10399c, "Failed to parse textdoc update content", e.getCause(), null, 4);
                                                it3 = it2;
                                                c21522k5 = c21522k5;
                                                str3 = str2;
                                                c3375j2 = c3375j1;
                                            }
                                        } catch (Exception e13) {
                                            e = e13;
                                            str2 = str3;
                                        }
                                    }
                                    it3 = it2;
                                    c21522k5 = c21522k5;
                                    str3 = str2;
                                    c3375j2 = c3375j1;
                                }
                            } else {
                                it = it3;
                                str = str3;
                                c21522k3 = c21522k5;
                                c21522k6 = null;
                            }
                            it3 = it;
                            c21522k5 = c21522k3;
                            str3 = str;
                            c21523l = null;
                        }
                        it = it3;
                        str = str3;
                        c21522k3 = c21522k5;
                        c21522k6 = c21522k4;
                        it3 = it;
                        c21522k5 = c21522k3;
                        str3 = str;
                        c21523l = null;
                    }
                    c21522k = c21522k5;
                    if (c21522k6 != null) {
                        c21522k2 = c21522k6;
                    }
                    if (c21522k2 != null) {
                        return c17296c;
                    }
                    c3408u1.f10385Z = 1;
                    if (((InterfaceC2186j) obj4).mo395a(c21522k2, c3408u1) == enumC19250a7) {
                        return enumC19250a7;
                    }
                    return c17296c;
                }
                c21522k = c21522k5;
                c21522k2 = c21522k;
                if (c21522k2 != null) {
                    return c17296c;
                }
                c3408u1.f10385Z = 1;
                if (((InterfaceC2186j) obj4).mo395a(c21522k2, c3408u1) == enumC19250a7) {
                    return enumC19250a7;
                }
                return c17296c;
            case 11:
                InterfaceC17405k interfaceC17405k = (InterfaceC17405k) obj3;
                C3544a c3544a = (C3544a) obj4;
                if (interfaceC17405k instanceof C17409o) {
                    C17409o c17409o = (C17409o) interfaceC17405k;
                    C3561r c3561rM4241a = c3544a.f10738t0;
                    if (c3561rM4241a == null) {
                        c3561rM4241a = AbstractC3569z.m4241a(c3544a.f10737s0);
                        c3544a.f10738t0 = c3561rM4241a;
                        AbstractC16544l.m18091d(c3561rM4241a);
                    }
                    C3563t c3563tM4235a = c3561rM4241a.m4235a(c3544a);
                    c3563tM4235a.m4237b(c17409o, c3544a.f10733o0, c3544a.f10741w0, c3544a.f10742x0, ((C14365u) c3544a.f10735q0.getValue()).f45062a, ((C3551h) c3544a.f10736r0.getValue()).f10762d, c3544a.f10743y0);
                    c3544a.f10739u0.setValue(c3563tM4235a);
                } else if (interfaceC17405k instanceof C17410p) {
                    C17409o c17409o2 = ((C17410p) interfaceC17405k).f55605a;
                    C3563t c3563t = (C3563t) c3544a.f10739u0.getValue();
                    if (c3563t != null) {
                        c3563t.m4239d();
                    }
                } else if (interfaceC17405k instanceof C17408n) {
                    C17409o c17409o3 = ((C17408n) interfaceC17405k).f55603a;
                    C3563t c3563t2 = (C3563t) c3544a.f10739u0.getValue();
                    if (c3563t2 != null) {
                        c3563t2.m4239d();
                    }
                } else {
                    c3544a.f10732Z.m958q(interfaceC17405k, (InterfaceC0571F) r13);
                }
                return c17296c;
            case 12:
                InterfaceC17405k interfaceC17405k2 = (InterfaceC17405k) obj3;
                RippleNode rippleNode = (RippleNode) obj4;
                if (!(interfaceC17405k2 instanceof InterfaceC17411q)) {
                    C0326m c0326m = rippleNode.f32641D0;
                    if (c0326m == null) {
                        c0326m = new C0326m(rippleNode.f32638A0, rippleNode.f32640C0);
                        AbstractC21690f.m22209n(rippleNode);
                        rippleNode.f32641D0 = c0326m;
                    }
                    c0326m.m958q(interfaceC17405k2, (InterfaceC0571F) r13);
                } else if (rippleNode.f32644G0) {
                    rippleNode.m11279N0((InterfaceC17411q) interfaceC17405k2);
                } else {
                    rippleNode.f32645H0.m14607a(interfaceC17405k2);
                }
                return c17296c;
            case 13:
                if (interfaceC18770c instanceof C3638p) {
                    c3638p = (C3638p) interfaceC18770c;
                    int i25 = c3638p.f11088Z;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        c3638p.f11088Z = i25 - Integer.MIN_VALUE;
                    } else {
                        c3638p = new C3638p(this, interfaceC18770c);
                    }
                } else {
                    c3638p = new C3638p(this, interfaceC18770c);
                }
                Object obj14 = c3638p.f11087Y;
                EnumC19250a enumC19250a8 = EnumC19250a.f61036Y;
                int i26 = c3638p.f11088Z;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj14);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj14);
                InterfaceC4267d interfaceC4267d = (InterfaceC4267d) obj3;
                if (!AbstractC16544l.m18089b(interfaceC4267d.getId(), ((C17852e) r13).f56922b.toString()) && interfaceC4267d.getId() != null) {
                    return c17296c;
                }
                c3638p.f11088Z = 1;
                return ((InterfaceC2186j) obj4).mo395a(obj3, c3638p) == enumC19250a8 ? enumC19250a8 : c17296c;
            case 14:
                if (interfaceC18770c instanceof C3639q) {
                    c3639q = (C3639q) interfaceC18770c;
                    int i27 = c3639q.f11091Z;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        c3639q.f11091Z = i27 - Integer.MIN_VALUE;
                    } else {
                        c3639q = new C3639q(this, interfaceC18770c);
                    }
                } else {
                    c3639q = new C3639q(this, interfaceC18770c);
                }
                Object obj15 = c3639q.f11090Y;
                EnumC19250a enumC19250a9 = EnumC19250a.f61036Y;
                int i28 = c3639q.f11091Z;
                if (i28 != 0) {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj15);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj15);
                if (((C2344c) r13).f7279f) {
                    return c17296c;
                }
                c3639q.f11091Z = 1;
                return ((InterfaceC2186j) obj4).mo395a(obj3, c3639q) == enumC19250a9 ? enumC19250a9 : c17296c;
            case 15:
                InterfaceC17405k interfaceC17405k3 = (InterfaceC17405k) obj3;
                C16558z c16558z2 = (C16558z) obj4;
                if (interfaceC17405k3 instanceof C17409o) {
                    c16558z2.f51287Y++;
                } else if ((interfaceC17405k3 instanceof C17410p) || (interfaceC17405k3 instanceof C17408n)) {
                    c16558z2.f51287Y--;
                }
                z6 = c16558z2.f51287Y > 0;
                C4148v4 c4148v4 = (C4148v4) r13;
                if (c4148v4.f13435B0 != z6) {
                    c4148v4.f13435B0 = z6;
                    AbstractC21690f.m22210o(c4148v4);
                }
                return c17296c;
            case 16:
                if (interfaceC18770c instanceof C4648c) {
                    c4648c = (C4648c) interfaceC18770c;
                    int i29 = c4648c.f15115Z;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        c4648c.f15115Z = i29 - Integer.MIN_VALUE;
                    } else {
                        c4648c = new C4648c(this, interfaceC18770c);
                    }
                } else {
                    c4648c = new C4648c(this, interfaceC18770c);
                }
                Object obj16 = c4648c.f15114Y;
                EnumC19250a enumC19250a10 = EnumC19250a.f61036Y;
                int i30 = c4648c.f15115Z;
                if (i30 != 0) {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj16);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj16);
                C17309l c17309l2 = (C17309l) obj3;
                C6617X c6617x = (C6617X) c17309l2.f55136Y;
                C7351f0 c7351f0 = (C7351f0) c17309l2.f55137Z;
                if (c6617x == null) {
                    return c17296c;
                }
                C4666u c4666u = (C4666u) r13;
                if (AbstractC21322p.m21681O((String) c4666u.f15199e.getValue())) {
                    return c17296c;
                }
                C6172d c6172d = c6617x.f21344b;
                if (!AbstractC16544l.m18089b(c6172d.f20091a.f28480b, (String) c4666u.f15199e.getValue())) {
                    return c17296c;
                }
                if (c6172d.f20093c != EnumC6170b.f20088p0) {
                    return c17296c;
                }
                if (c7351f0 != null && (c9440i = c7351f0.f23300o) != null) {
                    c9463v = c9440i.f28433d;
                }
                if (c9463v == null) {
                    return c17296c;
                }
                c4648c.f15115Z = 1;
                return ((InterfaceC2186j) obj4).mo395a(obj3, c4648c) == enumC19250a10 ? enumC19250a10 : c17296c;
            case 17:
                C15102a c15102a = ((C5842n) obj4).f19115w;
                String sid = ((C6497q) r13).f20992c;
                Set features = (Set) obj3;
                c15102a.getClass();
                AbstractC16544l.m18094g(sid, "sid");
                AbstractC16544l.m18094g(features, "features");
                C4750V0 c4750v0 = c15102a.f46941a;
                c4750v0.getClass();
                C14720c4 c14720c4NewBuilder = LivekitRtc$SignalRequest.newBuilder();
                C14587G4 c14587g4NewBuilder = LivekitRtc$UpdateLocalAudioTrack.newBuilder();
                c14587g4NewBuilder.m13863d();
                ((LivekitRtc$UpdateLocalAudioTrack) c14587g4NewBuilder.f36981Z).setTrackSid(sid);
                c14587g4NewBuilder.m13863d();
                ((LivekitRtc$UpdateLocalAudioTrack) c14587g4NewBuilder.f36981Z).addAllFeatures(features);
                LivekitRtc$UpdateLocalAudioTrack livekitRtc$UpdateLocalAudioTrack = (LivekitRtc$UpdateLocalAudioTrack) c14587g4NewBuilder.m13861b();
                c14720c4NewBuilder.m13863d();
                ((LivekitRtc$SignalRequest) c14720c4NewBuilder.f36981Z).setUpdateAudioTrack(livekitRtc$UpdateLocalAudioTrack);
                c4750v0.m5430t((LivekitRtc$SignalRequest) c14720c4NewBuilder.m13861b());
                return c17296c;
            case 18:
                if (interfaceC18770c instanceof C5820B) {
                    c5820b = (C5820B) interfaceC18770c;
                    int i31 = c5820b.f18991Z;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        c5820b.f18991Z = i31 - Integer.MIN_VALUE;
                    } else {
                        c5820b = new C5820B(this, interfaceC18770c);
                    }
                } else {
                    c5820b = new C5820B(this, interfaceC18770c);
                }
                Object obj17 = c5820b.f18990Y;
                EnumC19250a enumC19250a11 = EnumC19250a.f61036Y;
                int i32 = c5820b.f18991Z;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj17);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj17);
                AbstractC6470Q abstractC6470Q = (AbstractC6470Q) r13;
                C17309l c17309l3 = new C17309l(abstractC6470Q, abstractC6470Q.m7055c());
                c5820b.f18991Z = 1;
                return ((InterfaceC2186j) obj4).mo395a(c17309l3, c5820b) == enumC19250a11 ? enumC19250a11 : c17296c;
            case 19:
                if (interfaceC18770c instanceof C6232f) {
                    c6232f = (C6232f) interfaceC18770c;
                    int i33 = c6232f.f20295Z;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        c6232f.f20295Z = i33 - Integer.MIN_VALUE;
                    } else {
                        c6232f = new C6232f(this, interfaceC18770c);
                    }
                } else {
                    c6232f = new C6232f(this, interfaceC18770c);
                }
                Object obj18 = c6232f.f20294Y;
                EnumC19250a enumC19250a12 = EnumC19250a.f61036Y;
                int i34 = c6232f.f20295Z;
                if (i34 == 0) {
                    AbstractC9233X.m9807c(obj18);
                    InterfaceC2186j interfaceC2186j11 = (InterfaceC2186j) obj4;
                    c6232f.f20296o0 = interfaceC2186j11;
                    c6232f.f20295Z = 1;
                    Object objM9685d = AbstractC9138H.m9685d((C6888a) r13, (C17853f) obj3, c6232f);
                    if (objM9685d != enumC19250a12) {
                        obj18 = objM9685d;
                        interfaceC2186j6 = interfaceC2186j11;
                    }
                    return enumC19250a12;
                }
                if (i34 != 1) {
                    if (i34 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj18);
                    return c17296c;
                }
                interfaceC2186j6 = c6232f.f20296o0;
                AbstractC9233X.m9807c(obj18);
                c6232f.f20296o0 = null;
                c6232f.f20295Z = 2;
                if (interfaceC2186j6.mo395a(obj18, c6232f) != enumC19250a12) {
                    return c17296c;
                }
                return enumC19250a12;
            case 20:
                if (interfaceC18770c instanceof C6434i) {
                    c6434i = (C6434i) interfaceC18770c;
                    int i35 = c6434i.f20892Z;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        c6434i.f20892Z = i35 - Integer.MIN_VALUE;
                    } else {
                        c6434i = new C6434i(this, interfaceC18770c);
                    }
                } else {
                    c6434i = new C6434i(this, interfaceC18770c);
                }
                Object obj19 = c6434i.f20891Y;
                EnumC19250a enumC19250a13 = EnumC19250a.f61036Y;
                int i36 = c6434i.f20892Z;
                if (i36 != 0) {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj19);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj19);
                Uri uri = (Uri) obj3;
                if (uri != null) {
                    C6435j c6435j = (C6435j) r13;
                    String type = c6435j.f20895c.getContentResolver().getType(uri);
                    Context context = c6435j.f20895c;
                    Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
                    if (cursorQuery != null) {
                        cursorQuery.moveToFirst();
                    }
                    String string = cursorQuery != null ? cursorQuery.getString(Math.max(cursorQuery.getColumnIndex("_display_name"), 0)) : null;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type);
                    if (extensionFromMimeType == null) {
                        extensionFromMimeType = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
                    }
                    File file = new File(context.getExternalFilesDir(""), "document_upload_" + UUID.randomUUID() + Separators.DOT + extensionFromMimeType);
                    InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                    AbstractC16544l.m18091d(inputStreamOpenInputStream);
                    C15379d c15379dM9509d = AbstractC8752z3.m9509d(new FileOutputStream(file), file);
                    try {
                        try {
                            AbstractC7934L5.m8227a(inputStreamOpenInputStream, c15379dM9509d);
                            AbstractC7942M5.m8232a(inputStreamOpenInputStream, null);
                            AbstractC7942M5.m8232a(c15379dM9509d, null);
                            String absolutePath = file.getAbsolutePath();
                            AbstractC16544l.m18093f(absolutePath, "getAbsolutePath(...)");
                            c6432g = new C6432g(absolutePath, string);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                AbstractC7942M5.m8232a(inputStreamOpenInputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            AbstractC7942M5.m8232a(c15379dM9509d, th4);
                            throw th5;
                        }
                    }
                } else {
                    c6432g = C6431f.f20888a;
                }
                c6434i.f20892Z = 1;
                return ((InterfaceC2186j) obj4).mo395a(c6432g, c6434i) == enumC19250a13 ? enumC19250a13 : c17296c;
            case 21:
                return m433d(obj, interfaceC18770c);
            case 22:
                if (interfaceC18770c instanceof C6486f) {
                    c6486f = (C6486f) interfaceC18770c;
                    int i37 = c6486f.f21044Z;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        c6486f.f21044Z = i37 - Integer.MIN_VALUE;
                    } else {
                        c6486f = new C6486f(this, interfaceC18770c);
                    }
                } else {
                    c6486f = new C6486f(this, interfaceC18770c);
                }
                Object obj20 = c6486f.f21043Y;
                EnumC19250a enumC19250a14 = EnumC19250a.f61036Y;
                int i38 = c6486f.f21044Z;
                if (i38 != 0) {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj20);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj20);
                C17309l c17309l4 = (C17309l) obj3;
                C6484d c6484d = C6487g.Companion;
                C6487g c6487g = (C6487g) r13;
                c6487g.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                C6488h c6488h = c6487g.f21047j;
                if (c6488h.f21053b) {
                    linkedHashSet.add(EnumC14679W1.TF_ECHO_CANCELLATION);
                }
                if (c6488h.f21052a) {
                    linkedHashSet.add(EnumC14679W1.TF_NOISE_SUPPRESSION);
                }
                if (c6488h.f21054c) {
                    linkedHashSet.add(EnumC14679W1.TF_AUTO_GAIN_CONTROL);
                }
                InterfaceC2111l interfaceC2111l = (InterfaceC2111l) c17309l4.f55136Y;
                if (!((Boolean) c17309l4.f55137Z).booleanValue()) {
                    if (AbstractC16544l.m18089b(interfaceC2111l != null ? "krisp_noise_cancellation" : null, "krisp_noise_cancellation")) {
                        linkedHashSet.add(EnumC14679W1.TF_ENHANCED_NOISE_CANCELLATION);
                    }
                }
                c6486f.f21044Z = 1;
                return ((InterfaceC2186j) obj4).mo395a(linkedHashSet, c6486f) == enumC19250a14 ? enumC19250a14 : c17296c;
            case 23:
                Object objMo395a2 = ((InterfaceC2186j) obj4).mo395a(((InterfaceC1436k) r13).invoke(obj3), interfaceC18770c);
                return objMo395a2 == EnumC19250a.f61036Y ? objMo395a2 : c17296c;
            case 24:
                return m437c((AbstractC7701i) obj3, interfaceC18770c);
            case 25:
                ((InterfaceC9047e) obj4).mo7909b((C11245p) r13, (AbstractC9045c) obj3);
                return c17296c;
            case 26:
                return m434g(obj, interfaceC18770c);
            case 27:
                if (interfaceC18770c instanceof C10643G) {
                    c10643g = (C10643G) interfaceC18770c;
                    int i39 = c10643g.f31575Z;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        c10643g.f31575Z = i39 - Integer.MIN_VALUE;
                    } else {
                        c10643g = new C10643G(this, interfaceC18770c);
                    }
                } else {
                    c10643g = new C10643G(this, interfaceC18770c);
                }
                Object obj21 = c10643g.f31574Y;
                EnumC19250a enumC19250a15 = EnumC19250a.f61036Y;
                int i40 = c10643g.f31575Z;
                if (i40 != 0) {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj21);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj21);
                Object obj22 = ((C17312o) obj3).f55139Y;
                Throwable thM18979a = C17312o.m18979a(obj22);
                C10645H c10645h = (C10645H) r13;
                if (thM18979a == null) {
                    if (((AbstractC18478m0) obj22) instanceof C18472j0) {
                        obj2 = C10639E.f31567a;
                    } else {
                        EnumC10647I enumC10647I = EnumC10647I.f31589r0;
                        c10645h.getClass();
                        c10637d = new C10637D(enumC10647I);
                    }
                    c10643g.f31575Z = 1;
                    if (((InterfaceC2186j) obj4).mo395a(obj2, c10643g) == enumC19250a15) {
                        return enumC19250a15;
                    }
                    return c17296c;
                }
                EnumC10647I enumC10647IM8687d = AbstractC8146n0.m8687d(thM18979a);
                c10645h.getClass();
                c10637d = new C10637D(enumC10647IM8687d);
                obj2 = c10637d;
                c10643g.f31575Z = 1;
                if (((InterfaceC2186j) obj4).mo395a(obj2, c10643g) == enumC19250a15) {
                    return enumC19250a15;
                }
                return c17296c;
            case 28:
                return m435h(obj, interfaceC18770c);
            default:
                if (interfaceC18770c instanceof C13140S) {
                    c13140s = (C13140S) interfaceC18770c;
                    int i41 = c13140s.f41716Z;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        c13140s.f41716Z = i41 - Integer.MIN_VALUE;
                    } else {
                        c13140s = new C13140S(this, interfaceC18770c);
                    }
                } else {
                    c13140s = new C13140S(this, interfaceC18770c);
                }
                Object obj23 = c13140s.f41715Y;
                EnumC19250a enumC19250a16 = EnumC19250a.f61036Y;
                int i42 = c13140s.f41716Z;
                if (i42 != 0) {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj23);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj23);
                C13139Q c13139q = (C13139Q) ((Map) obj3).get((EnumC1702g) r13);
                if (c13139q == null) {
                    boolValueOf = Boolean.FALSE;
                } else {
                    if (c13139q.f41712a && !c13139q.f41713b && !c13139q.f41714c) {
                        z6 = true;
                    }
                    boolValueOf = Boolean.valueOf(z6);
                }
                c13140s.f41716Z = 1;
                return ((InterfaceC2186j) obj4).mo395a(boolValueOf, c13140s) == enumC19250a16 ? enumC19250a16 : c17296c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m436b(int i10, InterfaceC18770c interfaceC18770c) {
        C2139J0 c2139j0;
        if (interfaceC18770c instanceof C2139J0) {
            c2139j0 = (C2139J0) interfaceC18770c;
            int i11 = c2139j0.f6552o0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2139j0.f6552o0 = i11 - Integer.MIN_VALUE;
            } else {
                c2139j0 = new C2139J0(this, interfaceC18770c);
            }
        } else {
            c2139j0 = new C2139J0(this, interfaceC18770c);
        }
        Object obj = c2139j0.f6550Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = c2139j0.f6552o0;
        C17296C c17296c = C17296C.f55119a;
        if (i12 == 0) {
            AbstractC9233X.m9807c(obj);
            if (i10 > 0) {
                C16556x c16556x = (C16556x) this.f550o0;
                if (!c16556x.f51285Y) {
                    c16556x.f51285Y = true;
                    EnumC2131F0 enumC2131F0 = EnumC2131F0.f6526Y;
                    c2139j0.f6552o0 = 1;
                    if (((InterfaceC2186j) this.f549Z).mo395a(enumC2131F0, c2139j0) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m437c(AbstractC7701i abstractC7701i, InterfaceC18770c interfaceC18770c) {
        C7705m c7705m;
        C0132i c0132i;
        if (interfaceC18770c instanceof C7705m) {
            c7705m = (C7705m) interfaceC18770c;
            int i10 = c7705m.f24274q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c7705m.f24274q0 = i10 - Integer.MIN_VALUE;
            } else {
                c7705m = new C7705m(this, interfaceC18770c);
            }
        } else {
            c7705m = new C7705m(this, interfaceC18770c);
        }
        Object obj = c7705m.f24272o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c7705m.f24274q0;
        if (i11 != 0) {
            if (i11 == 1) {
                abstractC7701i = c7705m.f24271Z;
                c0132i = c7705m.f24270Y;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        long integer = ((C7707o) this.f550o0).f24279c.getResources().getInteger(R.integer.pi2_transition_animation_duration);
        c7705m.f24270Y = this;
        c7705m.f24271Z = abstractC7701i;
        c7705m.f24274q0 = 1;
        if (AbstractC0575H.m1184m(integer, c7705m) == enumC19250a) {
            return enumC19250a;
        }
        c0132i = this;
        InterfaceC2186j interfaceC2186j = (InterfaceC2186j) c0132i.f549Z;
        c7705m.f24270Y = null;
        c7705m.f24271Z = null;
        c7705m.f24274q0 = 2;
        if (interfaceC2186j.mo395a(abstractC7701i, c7705m) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    private final Object m435h(Object obj, InterfaceC18770c interfaceC18770c) {
        C13164r c13164r;
        if (interfaceC18770c instanceof C13164r) {
            c13164r = (C13164r) interfaceC18770c;
            int i10 = c13164r.f41792Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13164r.f41792Z = i10 - Integer.MIN_VALUE;
            } else {
                c13164r = new C13164r(this, interfaceC18770c);
            }
        } else {
            c13164r = new C13164r(this, interfaceC18770c);
        }
        Object obj2 = c13164r.f41791Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c13164r.f41792Z;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj2);
            C0515d c0515d = (C0515d) obj;
            C22050r c22050r = (C22050r) ((C13166t) this.f549Z).f41804h.getValue();
            C0515d c0515dM1127c = c0515d.m1127c(c22050r != null ? c22050r.f69739a : null, "accountUserStateFlow");
            c13164r.f41792Z = 1;
            if (((InterfaceC2186j) this.f550o0).mo395a(c0515dM1127c, c13164r) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException(qffLJgOYizGmMj.stJG);
            }
            AbstractC9233X.m9807c(obj2);
        }
        return C17296C.f55119a;
    }
}
