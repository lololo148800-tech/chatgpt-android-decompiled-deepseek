package p499U9;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import bo.AbstractC11523k;
import com.google.protobuf.InterfaceC12163j0;
import ec.C13360b;
import io.sentry.C15321b1;
import io.sentry.EnumC15359h;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.clientreport.EnumC15337e;
import io.sentry.clientreport.InterfaceC15339g;
import io.sentry.instrumentation.file.C15378c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import javax.crypto.KeyAgreement;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.C16644c;
import p032B4.InterfaceC0808c;
import p1073w3.AbstractC20817s;
import p1111xl.C21296a;
import p115E9.C2360b;
import p117Eb.C2392v;
import p178H.C3124Q;
import p178H.C3130X;
import p178H.C3179x;
import p178H.InterfaceC3122O;
import p182H3.C3208i;
import p182H3.C3213n;
import p182H3.InterfaceC3209j;
import p182H3.InterfaceC3210k;
import p210I7.C3650b;
import p210I7.InterfaceC3649a;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p228J.C3857q0;
import p228J.C3862t;
import p228J.InterfaceC3805H;
import p228J.InterfaceC3864u;
import p265Kb.C4622o;
import p265Kb.InterfaceC4623p;
import p301M.AbstractC5229k;
import p301M.C5231m;
import p364Oh.C6227a;
import p364Oh.C6228b;
import p372P3.C6332n;
import p372P3.InterfaceC6310B;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6335q;
import p422R7.C6825j;
import p434Rk.C6911c;
import p451Sb.C7102a;
import p523V9.AbstractC8160o6;
import p544W9.AbstractC8746y3;
import p556Wk.C8915b0;
import p571X9.AbstractC9233X;
import p572Xa.InterfaceC9419m;
import p591Y5.InterfaceC9651b;
import p594Y9.AbstractC9710C4;
import p594Y9.C9854a5;
import p594Y9.InterfaceC9882e5;
import p658b5.C11241l;
import p658b5.C11242m;
import p661b7.InterfaceC11256c;
import p676c7.C11682a;
import p747fb.InterfaceFutureC13608b;
import p784hb.InterfaceC14441j;
import p793ho.EnumC14679W1;
import p802i6.C14935a;
import p817j$.util.Objects;
import p996rm.EnumC19250a;
import pl.C18506a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: U9.u */
/* JADX INFO: loaded from: classes.dex */
public final class C7591u implements InterfaceC0808c, InterfaceC3209j, InterfaceC3864u, InterfaceC4623p, InterfaceC3649a, InterfaceC6335q, InterfaceC9419m, InterfaceC9651b, InterfaceC9882e5, InterfaceC14441j, InterfaceC12163j0, InterfaceC15339g {

    /* JADX INFO: renamed from: Z */
    public static C7591u f24013Z;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f24014Y;

    public /* synthetic */ C7591u(int i10) {
        this.f24014Y = i10;
    }

    /* JADX INFO: renamed from: H */
    public static Uri m7934H(File file, File file2) throws C3124Q {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new C3124Q("Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX INFO: renamed from: I */
    public static Uri m7935I(File file, C2392v c2392v) throws Throwable {
        Uri uriInsert;
        int i10;
        ContentValues contentValues;
        ContentResolver contentResolver = (ContentResolver) c2392v.f7437o0;
        Objects.requireNonNull(contentResolver);
        ContentValues contentValues2 = (ContentValues) c2392v.f7439q0;
        ContentValues contentValues3 = contentValues2 != null ? new ContentValues(contentValues2) : new ContentValues();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            contentValues3.put("is_pending", (Integer) 1);
        }
        try {
            try {
                uriInsert = contentResolver.insert((Uri) c2392v.f7438p0, contentValues3);
                try {
                    if (uriInsert == null) {
                        throw new C3124Q("Failed to insert a MediaStore URI.", null);
                    }
                    m7936J(file, uriInsert, contentResolver);
                    if (i11 >= 29) {
                        ContentValues contentValues4 = new ContentValues();
                        if (i11 >= 29) {
                            contentValues4.put("is_pending", (Integer) 0);
                        }
                        contentResolver.update(uriInsert, contentValues4, null, null);
                    }
                    return uriInsert;
                } catch (IOException e10) {
                    e = e10;
                    throw new C3124Q("Failed to write to MediaStore URI: " + uriInsert, e);
                } catch (SecurityException e11) {
                    e = e11;
                    throw new C3124Q("Failed to write to MediaStore URI: " + uriInsert, e);
                }
            } catch (Throwable th2) {
                th = th2;
                if (c2392v != 0 && (i10 = Build.VERSION.SDK_INT) >= 29) {
                    contentValues = new ContentValues();
                    if (i10 >= 29) {
                        contentValues.put("is_pending", (Integer) 0);
                    }
                    contentResolver.update(c2392v, contentValues, null, null);
                }
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            uriInsert = null;
            throw new C3124Q("Failed to write to MediaStore URI: " + uriInsert, e);
        } catch (SecurityException e13) {
            e = e13;
            uriInsert = null;
            throw new C3124Q("Failed to write to MediaStore URI: " + uriInsert, e);
        } catch (Throwable th3) {
            th = th3;
            c2392v = 0;
            if (c2392v != 0) {
                contentValues = new ContentValues();
                if (i10 >= 29) {
                    contentValues.put("is_pending", (Integer) 0);
                }
                contentResolver.update(c2392v, contentValues, null, null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: J */
    public static void m7936J(File file, Uri uri, ContentResolver contentResolver) throws IOException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (outputStreamOpenOutputStream == null) {
                throw new FileNotFoundException(uri + " cannot be resolved.");
            }
            C15378c c15378cM9492c = AbstractC8746y3.m9492c(file, new FileInputStream(file));
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = c15378cM9492c.read(bArr);
                    if (i10 <= 0) {
                        c15378cM9492c.close();
                        outputStreamOpenOutputStream.close();
                        return;
                    }
                    outputStreamOpenOutputStream.write(bArr, 0, i10);
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            outputStreamOpenOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c15378cM9492c.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            if (outputStreamOpenOutputStream != null) {
                outputStreamOpenOutputStream.close();
            }
            throw th5;
        }
    }

    /* JADX INFO: renamed from: K */
    public static MediaCodec m7937K(C3208i c3208i) throws IOException {
        C3213n c3213n = c3208i.f9697a;
        StringBuilder sb2 = new StringBuilder("createCodec:");
        String str = c3213n.f9703a;
        sb2.append(str);
        Trace.beginSection(sb2.toString());
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: M */
    public static boolean m7938M(C11682a datadogContext, String str) {
        AbstractC16544l.m18094g(datadogContext, "datadogContext");
        Map map = (Map) datadogContext.f35424p.get("session-replay");
        if (map == null) {
            return false;
        }
        Object obj = map.get(str);
        Map map2 = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map2 != null ? map2.get("has_replay") : null;
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    public static final CharSequence m7939N(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // p784hb.InterfaceC14441j
    /* JADX INFO: renamed from: A */
    public Object mo3663A(Provider provider) {
        return provider == null ? KeyAgreement.getInstance("SHA-512") : KeyAgreement.getInstance("SHA-512", provider);
    }

    @Override // p591Y5.InterfaceC9651b
    /* JADX INFO: renamed from: B */
    public float mo4174B() {
        return 0.0f;
    }

    @Override // p372P3.InterfaceC6335q
    /* JADX INFO: renamed from: D */
    public InterfaceC6316H mo3044D(int i10, int i11) {
        return new C6332n();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX INFO: renamed from: L */
    public Serializable m7941L(C8915b0 c8915b0, AbstractC19687c abstractC19687c) {
        C6227a c6227a;
        InterfaceC3777y interfaceC3777yM18075c;
        C8915b0 c8915b1 = c8915b0;
        if (abstractC19687c instanceof C6227a) {
            c6227a = (C6227a) abstractC19687c;
            int i10 = c6227a.f20280p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6227a.f20280p0 = i10 - Integer.MIN_VALUE;
            } else {
                c6227a = new C6227a(this, abstractC19687c);
            }
        } else {
            c6227a = new C6227a(this, abstractC19687c);
        }
        Object objM7294a = c6227a.f20278Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6227a.f20280p0;
        try {
            try {
                if (i11 == 0) {
                    AbstractC9233X.m9807c(objM7294a);
                    C6911c c6911cMo7303b = c8915b1.f27285Y.mo7303b();
                    InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C16644c.class);
                    try {
                        interfaceC3777yM18075c = AbstractC16526C.m18075c(C16644c.class);
                    } catch (Throwable unused) {
                        interfaceC3777yM18075c = null;
                    }
                    C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
                    c6227a.f20277Y = c8915b1;
                    c6227a.f20280p0 = 1;
                    objM7294a = c6911cMo7303b.m7294a(c21296a, c6227a);
                    if (objM7294a == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c8915b1 = c6227a.f20277Y;
                    AbstractC9233X.m9807c(objM7294a);
                }
                C8915b0 c8915b2 = c8915b1;
                if (objM7294a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
                }
                C16644c c16644c = (C16644c) objM7294a;
                if (!c16644c.containsKey("message") && !c16644c.containsKey("type")) {
                    if (c16644c.containsKey("detail")) {
                        AbstractC16643b abstractC16643b = (AbstractC16643b) c16644c.get("detail");
                        if (!(abstractC16643b instanceof C16644c)) {
                            return new C6228b(c8915b2, String.valueOf(abstractC16643b), null, new Integer(c8915b2.f27285Y.mo7307f().f51013Y), false, 16);
                        }
                        if (!((C16644c) abstractC16643b).containsKey("message") && !((C16644c) abstractC16643b).containsKey("type")) {
                            if (!((C16644c) abstractC16643b).containsKey("description") && !((C16644c) abstractC16643b).containsKey("reason")) {
                                if (((C16644c) abstractC16643b).containsKey("code")) {
                                    AbstractC16643b abstractC16643b2 = (AbstractC16643b) ((C16644c) abstractC16643b).get("code");
                                    String strMo12922f = abstractC16643b2 != null ? AbstractC11523k.m12918k(abstractC16643b2).mo12922f() : null;
                                    AbstractC16643b abstractC16643b3 = (AbstractC16643b) ((C16644c) abstractC16643b).get("can_retry");
                                    return new C6228b(c8915b2, null, strMo12922f, null, abstractC16643b3 != null ? AbstractC11523k.m12912e(AbstractC11523k.m12918k(abstractC16643b3)) : false, 8);
                                }
                            }
                            AbstractC16643b abstractC16643b4 = (AbstractC16643b) ((C16644c) abstractC16643b).get("description");
                            String strMo12922f2 = abstractC16643b4 != null ? AbstractC11523k.m12918k(abstractC16643b4).mo12922f() : null;
                            AbstractC16643b abstractC16643b5 = (AbstractC16643b) ((C16644c) abstractC16643b).get("reason");
                            String strMo12922f3 = abstractC16643b5 != null ? AbstractC11523k.m12918k(abstractC16643b5).mo12922f() : null;
                            AbstractC16643b abstractC16643b6 = (AbstractC16643b) ((C16644c) abstractC16643b).get("can_retry");
                            return new C6228b(c8915b2, strMo12922f2, strMo12922f3, null, abstractC16643b6 != null ? AbstractC11523k.m12912e(AbstractC11523k.m12918k(abstractC16643b6)) : false, 8);
                        }
                        AbstractC16643b abstractC16643b7 = (AbstractC16643b) ((C16644c) abstractC16643b).get("message");
                        String strMo12922f4 = abstractC16643b7 != null ? AbstractC11523k.m12918k(abstractC16643b7).mo12922f() : null;
                        AbstractC16643b abstractC16643b8 = (AbstractC16643b) ((C16644c) abstractC16643b).get("type");
                        String strMo12922f5 = abstractC16643b8 != null ? AbstractC11523k.m12918k(abstractC16643b8).mo12922f() : null;
                        AbstractC16643b abstractC16643b9 = (AbstractC16643b) ((C16644c) abstractC16643b).get("can_retry");
                        return new C6228b(c8915b2, strMo12922f4, strMo12922f5, null, abstractC16643b9 != null ? AbstractC11523k.m12912e(AbstractC11523k.m12918k(abstractC16643b9)) : false, 8);
                    }
                    return null;
                }
                AbstractC16643b abstractC16643b10 = (AbstractC16643b) c16644c.get("message");
                String strMo12922f6 = abstractC16643b10 != null ? AbstractC11523k.m12918k(abstractC16643b10).mo12922f() : null;
                AbstractC16643b abstractC16643b11 = (AbstractC16643b) c16644c.get("type");
                String strMo12922f7 = abstractC16643b11 != null ? AbstractC11523k.m12918k(abstractC16643b11).mo12922f() : null;
                AbstractC16643b abstractC16643b12 = (AbstractC16643b) c16644c.get("can_retry");
                return new C6228b(c8915b2, strMo12922f6, strMo12922f7, null, abstractC16643b12 != null ? AbstractC11523k.m12912e(AbstractC11523k.m12918k(abstractC16643b12)) : false, 8);
            } catch (IllegalArgumentException | C18506a unused2) {
            }
        } catch (Exception e10) {
            AbstractC8160o6.m8731f(C6228b.f20282r0, "Unexpected exception parsing ApiServiceError", e10, null, 4);
        }
    }

    @Override // p265Kb.InterfaceC4623p
    /* JADX INFO: renamed from: R */
    public Object mo3263R() {
        switch (this.f24014Y) {
            case 9:
                return new LinkedHashSet();
            default:
                return new C4622o(true);
        }
    }

    @Override // com.google.protobuf.InterfaceC12163j0
    /* JADX INFO: renamed from: a */
    public Object mo7515a(Object obj) {
        EnumC14679W1 enumC14679W1M16044a = EnumC14679W1.m16044a(((Integer) obj).intValue());
        return enumC14679W1M16044a == null ? EnumC14679W1.UNRECOGNIZED : enumC14679W1M16044a;
    }

    @Override // p591Y5.InterfaceC9651b
    /* JADX INFO: renamed from: b */
    public boolean mo4175b(float f10) {
        throw new IllegalStateException("not implemented");
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: c */
    public InterfaceFutureC13608b mo299c(boolean z6) {
        return C5231m.f16977o0;
    }

    @Override // p572Xa.InterfaceC9420n
    /* JADX INFO: renamed from: d */
    public Object mo3447d() {
        return new C7102a(15);
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: f */
    public InterfaceFutureC13608b mo302f(C3179x c3179x) {
        return AbstractC5229k.m5779c(new C3130X(1));
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: g */
    public InterfaceFutureC13608b mo303g(float f10) {
        return C5231m.f16977o0;
    }

    @Override // p210I7.InterfaceC3649a
    /* JADX INFO: renamed from: h */
    public Object mo4356h(Object obj) {
        C6825j event = (C6825j) obj;
        AbstractC16544l.m18094g(event, "event");
        return event;
    }

    @Override // p032B4.InterfaceC0808c
    /* JADX INFO: renamed from: i */
    public void mo1846i(Serializable serializable, int i10) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            AbstractC15256t.m16466d("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // p591Y5.InterfaceC9651b
    public boolean isEmpty() {
        return true;
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: j */
    public Rect mo305j() {
        return new Rect();
    }

    @Override // p591Y5.InterfaceC9651b
    /* JADX INFO: renamed from: k */
    public C14935a mo4176k() {
        throw new IllegalStateException("not implemented");
    }

    @Override // p591Y5.InterfaceC9651b
    /* JADX INFO: renamed from: m */
    public boolean mo4177m(float f10) {
        return false;
    }

    @Override // p032B4.InterfaceC0808c
    /* JADX INFO: renamed from: n */
    public void mo1847n() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: o */
    public InterfaceFutureC13608b mo308o(ArrayList arrayList, int i10, int i11) {
        return AbstractC5229k.m5779c(Collections.emptyList());
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: q */
    public InterfaceFutureC13608b mo310q(int i10, int i11) {
        return AbstractC5229k.m5779c(new C3862t());
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: r */
    public InterfaceC3805H mo311r() {
        return null;
    }

    @Override // p594Y9.InterfaceC9882e5
    /* JADX INFO: renamed from: t */
    public Object mo3670t(Object obj) {
        C9854a5 c9854a5 = (C9854a5) obj;
        float f10 = c9854a5.f29361r0;
        C13360b c13360b = new C13360b(c9854a5.f29356Y, c9854a5.f29357Z, c9854a5.f29358o0, c9854a5.f29359p0);
        AbstractC9710C4.m10304b(c9854a5.f29360q0, new C7102a(25));
        return c13360b;
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void mo314u(InterfaceC3122O interfaceC3122O) {
    }

    @Override // p591Y5.InterfaceC9651b
    /* JADX INFO: renamed from: y */
    public float mo4179y() {
        return 1.0f;
    }

    @Override // p182H3.InterfaceC3209j
    /* JADX INFO: renamed from: z */
    public InterfaceC3210k mo3448z(C3208i c3208i) {
        MediaCodec mediaCodecM7937K = null;
        try {
            mediaCodecM7937K = m7937K(c3208i);
            Trace.beginSection("configureCodec");
            mediaCodecM7937K.configure(c3208i.f9698b, c3208i.f9700d, c3208i.f9701e, 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecM7937K.start();
            Trace.endSection();
            C11242m c11242m = new C11242m();
            c11242m.f34018Y = mediaCodecM7937K;
            if (AbstractC20817s.f66106a < 21) {
                c11242m.f34019Z = mediaCodecM7937K.getInputBuffers();
                c11242m.f34020o0 = mediaCodecM7937K.getOutputBuffers();
            }
            return c11242m;
        } catch (IOException | RuntimeException e10) {
            if (mediaCodecM7937K != null) {
                mediaCodecM7937K.release();
            }
            throw e10;
        }
    }

    public C7591u(C2360b c2360b) {
        this.f24014Y = 15;
    }

    public C7591u(C3650b c3650b, InterfaceC11256c internalLogger) {
        this.f24014Y = 12;
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
    }

    public C7591u(Context context) {
        this.f24014Y = 3;
        context.getApplicationContext();
    }

    @Override // p372P3.InterfaceC6335q
    /* JADX INFO: renamed from: s */
    public void mo3061s() {
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: x */
    public void mo315x() {
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: C */
    public void mo295C(InterfaceC3805H interfaceC3805H) {
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: E */
    public void mo296E(C3857q0 c3857q0) {
    }

    @Override // p372P3.InterfaceC6335q
    /* JADX INFO: renamed from: F */
    public void mo3045F(InterfaceC6310B interfaceC6310B) {
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: l */
    public void mo307l(int i10) {
    }

    @Override // io.sentry.clientreport.InterfaceC15339g
    /* JADX INFO: renamed from: p */
    public C11241l mo7943p(C11241l c11241l) {
        return c11241l;
    }

    @Override // io.sentry.clientreport.InterfaceC15339g
    /* JADX INFO: renamed from: G */
    public void mo7940G(EnumC15337e enumC15337e, C11241l c11241l) {
    }

    @Override // io.sentry.clientreport.InterfaceC15339g
    /* JADX INFO: renamed from: e */
    public void mo7942e(EnumC15337e enumC15337e, EnumC15359h enumC15359h) {
    }

    @Override // io.sentry.clientreport.InterfaceC15339g
    /* JADX INFO: renamed from: w */
    public void mo7945w(EnumC15337e enumC15337e, C15321b1 c15321b1) {
    }

    @Override // io.sentry.clientreport.InterfaceC15339g
    /* JADX INFO: renamed from: v */
    public void mo7944v(EnumC15337e enumC15337e, EnumC15359h enumC15359h, long j10) {
    }
}
