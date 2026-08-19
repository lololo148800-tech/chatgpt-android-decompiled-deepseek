package p864l5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import androidx.lifecycle.AbstractC11105n;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import mm.C17309l;
import mm.C17314q;
import mo.C17349p;
import p007A5.AbstractC0366a;
import p007A5.AbstractC0369d;
import p007A5.AbstractC0371f;
import p007A5.C0375j;
import p007A5.C0376k;
import p007A5.C0377l;
import p007A5.ComponentCallbacks2C0378m;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0566C0;
import p025An.C0644w;
import p025An.InterfaceC0627n0;
import p033B5.C0822f;
import p1005s5.C19448a;
import p1005s5.C19450c;
import p1018t5.C19801a;
import p1033u5.C20118c;
import p1060v9.C20485c;
import p1075w5.AbstractC20832j;
import p1075w5.C20823a;
import p1075w5.C20825c;
import p1075w5.C20827e;
import p1075w5.C20830h;
import p1075w5.C20831i;
import p1075w5.C20833k;
import p1075w5.C20834l;
import p1075w5.C20838p;
import p1075w5.C20840r;
import p1075w5.InterfaceC20837o;
import p1098x5.C21129h;
import p1098x5.InterfaceC21130i;
import p1121y5.C21388a;
import p1121y5.InterfaceC21389b;
import p1144z5.C21800d;
import p1144z5.InterfaceC21802f;
import p1144z5.InterfaceC21803g;
import p153Fn.AbstractC2935m;
import p153Fn.C2925c;
import p201Hn.C3516e;
import p334Na.AbstractC5695b;
import p473T7.AbstractC7262c;
import p479Td.AbstractC7360k;
import p571X9.AbstractC9233X;
import p899n5.C17485b;
import p909nm.AbstractC17680n;
import p958q5.C18626a;
import p958q5.C18634i;
import p982r5.C18880h;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: l5.m */
/* JADX INFO: loaded from: classes.dex */
public final class C16826m implements InterfaceC16818e {

    /* JADX INFO: renamed from: a */
    public final Context f53988a;

    /* JADX INFO: renamed from: b */
    public final C20825c f53989b;

    /* JADX INFO: renamed from: c */
    public final C17314q f53990c;

    /* JADX INFO: renamed from: d */
    public final C0375j f53991d;

    /* JADX INFO: renamed from: e */
    public final C2925c f53992e;

    /* JADX INFO: renamed from: f */
    public final ComponentCallbacks2C0378m f53993f;

    /* JADX INFO: renamed from: g */
    public final C20485c f53994g;

    /* JADX INFO: renamed from: h */
    public final C16815b f53995h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f53996i;

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f53997j;

    /* JADX WARN: Multi-variable type inference failed */
    public C16826m(Context context, C20825c c20825c, C17314q c17314q, C17314q c17314q2, C17314q c17314q3, C16815b c16815b, C0375j c0375j) {
        Object c0376k;
        int i10 = 3;
        int i11 = 4;
        int i12 = 5;
        int i13 = 2;
        boolean z6 = true;
        char c9 = 1;
        int i14 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        this.f53988a = context;
        this.f53989b = c20825c;
        this.f53990c = c17314q;
        this.f53991d = c0375j;
        C0566C0 c0566c0M1176e = AbstractC0575H.m1176e();
        C3516e c3516e = AbstractC0593T.f1824a;
        this.f53992e = AbstractC0575H.m1174c(AbstractC5695b.m6138e(c0566c0M1176e, AbstractC2935m.f8797a.f3819q0).plus(new C16825l(this)));
        ComponentCallbacks2C0378m componentCallbacks2C0378m = new ComponentCallbacks2C0378m(this);
        this.f53993f = componentCallbacks2C0378m;
        C20485c c20485c = new C20485c();
        c20485c.f65029a = this;
        c20485c.f65030b = componentCallbacks2C0378m;
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 26) {
            if (!AbstractC0366a.f1253a) {
                c0376k = (i15 == 26 || i15 == 27) ? new C0377l() : new C0376k(z6, i14);
            }
            c20485c.f65031c = c0376k;
            this.f53994g = c20485c;
            C0822f c0822f = new C0822f(c16815b);
            c0822f.m1882d(new C19801a(i13), C17349p.class);
            c0822f.m1882d(new C19801a(i12), String.class);
            c0822f.m1882d(new C19801a(c9 == true ? 1 : 0), Uri.class);
            c0822f.m1882d(new C19801a(i11), Uri.class);
            c0822f.m1882d(new C19801a(i10), Integer.class);
            c0822f.m1882d(new C19801a(objArr4 == true ? 1 : 0), byte[].class);
            C19450c c19450c = new C19450c();
            ArrayList arrayList = c0822f.f2294c;
            arrayList.add(new C17309l(c19450c, Uri.class));
            arrayList.add(new C17309l(new C19448a(c0375j.f1272a), File.class));
            c0822f.m1881c(new C18634i(c17314q3, c17314q2, c0375j.f1274c), Uri.class);
            c0822f.m1881c(new C18626a(i12), File.class);
            c0822f.m1881c(new C18626a(objArr3 == true ? 1 : 0), Uri.class);
            c0822f.m1881c(new C18626a(i10), Uri.class);
            c0822f.m1881c(new C18626a(6), Uri.class);
            c0822f.m1881c(new C18626a(i11), Drawable.class);
            c0822f.m1881c(new C18626a(1), Bitmap.class);
            c0822f.m1881c(new C18626a(2), ByteBuffer.class);
            C17485b c17485b = new C17485b(c0375j.f1275d, c0375j.f1276e);
            ArrayList arrayList2 = c0822f.f2296e;
            arrayList2.add(c17485b);
            List listM7719h = AbstractC7262c.m7719h(c0822f.f2292a);
            this.f53995h = new C16815b(listM7719h, AbstractC7262c.m7719h(c0822f.f2293b), AbstractC7262c.m7719h(arrayList), AbstractC7262c.m7719h(c0822f.f2295d), AbstractC7262c.m7719h(arrayList2));
            this.f53996i = AbstractC17680n.m19362l0(listM7719h, new C18880h(this, componentCallbacks2C0378m, c20485c));
            this.f53997j = new AtomicBoolean(false);
        }
        boolean z10 = AbstractC0366a.f1253a;
        c0376k = new C0376k((boolean) (objArr2 == true ? 1 : 0), (int) (objArr == true ? 1 : 0));
        c20485c.f65031c = c0376k;
        this.f53994g = c20485c;
        C0822f c0822f2 = new C0822f(c16815b);
        c0822f2.m1882d(new C19801a(i13), C17349p.class);
        c0822f2.m1882d(new C19801a(i12), String.class);
        c0822f2.m1882d(new C19801a(c9 == true ? 1 : 0), Uri.class);
        c0822f2.m1882d(new C19801a(i11), Uri.class);
        c0822f2.m1882d(new C19801a(i10), Integer.class);
        c0822f2.m1882d(new C19801a(objArr4 == true ? 1 : 0), byte[].class);
        C19450c c19450c2 = new C19450c();
        ArrayList arrayList3 = c0822f2.f2294c;
        arrayList3.add(new C17309l(c19450c2, Uri.class));
        arrayList3.add(new C17309l(new C19448a(c0375j.f1272a), File.class));
        c0822f2.m1881c(new C18634i(c17314q3, c17314q2, c0375j.f1274c), Uri.class);
        c0822f2.m1881c(new C18626a(i12), File.class);
        c0822f2.m1881c(new C18626a(objArr3 == true ? 1 : 0), Uri.class);
        c0822f2.m1881c(new C18626a(i10), Uri.class);
        c0822f2.m1881c(new C18626a(6), Uri.class);
        c0822f2.m1881c(new C18626a(i11), Drawable.class);
        c0822f2.m1881c(new C18626a(1), Bitmap.class);
        c0822f2.m1881c(new C18626a(2), ByteBuffer.class);
        C17485b c17485b2 = new C17485b(c0375j.f1275d, c0375j.f1276e);
        ArrayList arrayList4 = c0822f2.f2296e;
        arrayList4.add(c17485b2);
        List listM7719h2 = AbstractC7262c.m7719h(c0822f2.f2292a);
        this.f53995h = new C16815b(listM7719h2, AbstractC7262c.m7719h(c0822f2.f2293b), AbstractC7262c.m7719h(arrayList3), AbstractC7262c.m7719h(c0822f2.f2295d), AbstractC7262c.m7719h(arrayList4));
        this.f53996i = AbstractC17680n.m19362l0(listM7719h2, new C18880h(this, componentCallbacks2C0378m, c20485c));
        this.f53997j = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00da A[Catch: all -> 0x00d7, PHI: r1 r2 r3 r4
      0x00da: PHI (r1v13 l5.m) = (r1v3 l5.m), (r1v14 l5.m), (r1v15 l5.m) binds: [B:26:0x0071, B:35:0x00c1, B:37:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r2v9 l5.c) = (r2v3 l5.c), (r2v16 l5.c), (r2v17 l5.c) binds: [B:26:0x0071, B:35:0x00c1, B:37:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r3v10 w5.i) = (r3v16 w5.i), (r3v17 w5.i), (r3v18 w5.i) binds: [B:26:0x0071, B:35:0x00c1, B:37:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r4v9 w5.o) = (r4v21 w5.o), (r4v22 w5.o), (r4v23 w5.o) binds: [B:26:0x0071, B:35:0x00c1, B:37:0x00d3] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x00d7, blocks: (B:54:0x013e, B:56:0x0145, B:59:0x0157, B:64:0x016f, B:60:0x015b, B:63:0x0169, B:65:0x0176, B:67:0x017a, B:69:0x0189, B:70:0x018e, B:51:0x0115, B:41:0x00da, B:43:0x00e4, B:44:0x00e7, B:46:0x00f7, B:47:0x00fa, B:32:0x00b8, B:34:0x00be, B:36:0x00c3, B:71:0x018f, B:72:0x0196), top: B:84:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4 A[Catch: all -> 0x00d7, TryCatch #1 {all -> 0x00d7, blocks: (B:54:0x013e, B:56:0x0145, B:59:0x0157, B:64:0x016f, B:60:0x015b, B:63:0x0169, B:65:0x0176, B:67:0x017a, B:69:0x0189, B:70:0x018e, B:51:0x0115, B:41:0x00da, B:43:0x00e4, B:44:0x00e7, B:46:0x00f7, B:47:0x00fa, B:32:0x00b8, B:34:0x00be, B:36:0x00c3, B:71:0x018f, B:72:0x0196), top: B:84:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f7 A[Catch: all -> 0x00d7, TryCatch #1 {all -> 0x00d7, blocks: (B:54:0x013e, B:56:0x0145, B:59:0x0157, B:64:0x016f, B:60:0x015b, B:63:0x0169, B:65:0x0176, B:67:0x017a, B:69:0x0189, B:70:0x018e, B:51:0x0115, B:41:0x00da, B:43:0x00e4, B:44:0x00e7, B:46:0x00f7, B:47:0x00fa, B:32:0x00b8, B:34:0x00be, B:36:0x00c3, B:71:0x018f, B:72:0x0196), top: B:84:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0111  */
    /* JADX WARN: Code duplicated, block: B:50:0x0113  */
    /* JADX WARN: Code duplicated, block: B:53:0x013d  */
    /* JADX WARN: Code duplicated, block: B:54:0x013e A[Catch: all -> 0x00d7, PHI: r0 r1 r2 r3 r4
      0x013e: PHI (r0v9 java.lang.Object) = (r0v5 java.lang.Object), (r0v20 java.lang.Object) binds: [B:16:0x0040, B:52:0x013b] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r1v11 l5.m) = (r1v8 l5.m), (r1v17 l5.m) binds: [B:16:0x0040, B:52:0x013b] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r2v7 l5.c) = (r2v5 l5.c), (r2v19 l5.c) binds: [B:16:0x0040, B:52:0x013b] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r3v8 w5.i) = (r3v21 w5.i), (r3v22 w5.i) binds: [B:16:0x0040, B:52:0x013b] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r4v7 w5.o) = (r4v26 w5.o), (r4v27 w5.o) binds: [B:16:0x0040, B:52:0x013b] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x00d7, blocks: (B:54:0x013e, B:56:0x0145, B:59:0x0157, B:64:0x016f, B:60:0x015b, B:63:0x0169, B:65:0x0176, B:67:0x017a, B:69:0x0189, B:70:0x018e, B:51:0x0115, B:41:0x00da, B:43:0x00e4, B:44:0x00e7, B:46:0x00f7, B:47:0x00fa, B:32:0x00b8, B:34:0x00be, B:36:0x00c3, B:71:0x018f, B:72:0x0196), top: B:84:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0145 A[Catch: all -> 0x00d7, TryCatch #1 {all -> 0x00d7, blocks: (B:54:0x013e, B:56:0x0145, B:59:0x0157, B:64:0x016f, B:60:0x015b, B:63:0x0169, B:65:0x0176, B:67:0x017a, B:69:0x0189, B:70:0x018e, B:51:0x0115, B:41:0x00da, B:43:0x00e4, B:44:0x00e7, B:46:0x00f7, B:47:0x00fa, B:32:0x00b8, B:34:0x00be, B:36:0x00c3, B:71:0x018f, B:72:0x0196), top: B:84:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0157 A[Catch: all -> 0x00d7, TryCatch #1 {all -> 0x00d7, blocks: (B:54:0x013e, B:56:0x0145, B:59:0x0157, B:64:0x016f, B:60:0x015b, B:63:0x0169, B:65:0x0176, B:67:0x017a, B:69:0x0189, B:70:0x018e, B:51:0x0115, B:41:0x00da, B:43:0x00e4, B:44:0x00e7, B:46:0x00f7, B:47:0x00fa, B:32:0x00b8, B:34:0x00be, B:36:0x00c3, B:71:0x018f, B:72:0x0196), top: B:84:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x015b A[Catch: all -> 0x00d7, TryCatch #1 {all -> 0x00d7, blocks: (B:54:0x013e, B:56:0x0145, B:59:0x0157, B:64:0x016f, B:60:0x015b, B:63:0x0169, B:65:0x0176, B:67:0x017a, B:69:0x0189, B:70:0x018e, B:51:0x0115, B:41:0x00da, B:43:0x00e4, B:44:0x00e7, B:46:0x00f7, B:47:0x00fa, B:32:0x00b8, B:34:0x00be, B:36:0x00c3, B:71:0x018f, B:72:0x0196), top: B:84:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0168  */
    /* JADX WARN: Code duplicated, block: B:63:0x0169 A[Catch: all -> 0x00d7, TryCatch #1 {all -> 0x00d7, blocks: (B:54:0x013e, B:56:0x0145, B:59:0x0157, B:64:0x016f, B:60:0x015b, B:63:0x0169, B:65:0x0176, B:67:0x017a, B:69:0x0189, B:70:0x018e, B:51:0x0115, B:41:0x00da, B:43:0x00e4, B:44:0x00e7, B:46:0x00f7, B:47:0x00fa, B:32:0x00b8, B:34:0x00be, B:36:0x00c3, B:71:0x018f, B:72:0x0196), top: B:84:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0176 A[Catch: all -> 0x00d7, TryCatch #1 {all -> 0x00d7, blocks: (B:54:0x013e, B:56:0x0145, B:59:0x0157, B:64:0x016f, B:60:0x015b, B:63:0x0169, B:65:0x0176, B:67:0x017a, B:69:0x0189, B:70:0x018e, B:51:0x0115, B:41:0x00da, B:43:0x00e4, B:44:0x00e7, B:46:0x00f7, B:47:0x00fa, B:32:0x00b8, B:34:0x00be, B:36:0x00c3, B:71:0x018f, B:72:0x0196), top: B:84:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x017a A[Catch: all -> 0x00d7, TRY_LEAVE, TryCatch #1 {all -> 0x00d7, blocks: (B:54:0x013e, B:56:0x0145, B:59:0x0157, B:64:0x016f, B:60:0x015b, B:63:0x0169, B:65:0x0176, B:67:0x017a, B:69:0x0189, B:70:0x018e, B:51:0x0115, B:41:0x00da, B:43:0x00e4, B:44:0x00e7, B:46:0x00f7, B:47:0x00fa, B:32:0x00b8, B:34:0x00be, B:36:0x00c3, B:71:0x018f, B:72:0x0196), top: B:84:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0189 A[Catch: all -> 0x00d7, TRY_ENTER, TryCatch #1 {all -> 0x00d7, blocks: (B:54:0x013e, B:56:0x0145, B:59:0x0157, B:64:0x016f, B:60:0x015b, B:63:0x0169, B:65:0x0176, B:67:0x017a, B:69:0x0189, B:70:0x018e, B:51:0x0115, B:41:0x00da, B:43:0x00e4, B:44:0x00e7, B:46:0x00f7, B:47:0x00fa, B:32:0x00b8, B:34:0x00be, B:36:0x00c3, B:71:0x018f, B:72:0x0196), top: B:84:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x019b A[Catch: all -> 0x01ab, TryCatch #2 {all -> 0x01ab, blocks: (B:73:0x0197, B:75:0x019b, B:79:0x01ad, B:80:0x01b6), top: B:85:0x0197 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01ad A[Catch: all -> 0x01ab, TryCatch #2 {all -> 0x01ab, blocks: (B:73:0x0197, B:75:0x019b, B:79:0x01ad, B:80:0x01b6), top: B:85:0x0197 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, l5.m] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, l5.c] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, w5.i] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v5, types: [w5.o] */
    /* JADX WARN: Type inference failed for: r4v6, types: [w5.o] */
    /* JADX INFO: renamed from: a */
    public static final Object m18562a(C16826m c16826m, C20831i c20831i, int i10, AbstractC19687c abstractC19687c) {
        C16823j c16823j;
        int i11;
        ?? r6;
        ?? r10;
        C16816c c16816c;
        C16826m c16826m2;
        Bitmap bitmap;
        Object objMo10210a;
        C16816c c16816c2;
        C16826m c16826m3;
        Object objM1168P;
        C16816c c16816c3;
        C16826m c16826m4;
        ?? r11;
        ?? r12;
        AbstractC20832j abstractC20832j;
        ?? r13;
        InterfaceC20837o interfaceC20837o;
        C20831i c20831i2;
        AbstractC20832j abstractC20832j2;
        C20838p c20838p;
        InterfaceC21389b interfaceC21389b;
        C20831i c20831i3;
        boolean z6;
        Drawable drawable;
        InterfaceC21802f interfaceC21802fMo22287a;
        InterfaceC20837o interfaceC20837o2;
        C20831i c20831i4;
        InterfaceC20837o interfaceC20837o3;
        C20831i c20831i5;
        Drawable drawableM1000b;
        InterfaceC21389b interfaceC21389b2;
        Object obj;
        InterfaceC20837o c20840r;
        C20831i c20831iM21435a;
        C16816c c16816c4;
        int i12;
        C16826m c16826m5 = c16826m;
        c16826m.getClass();
        if (abstractC19687c instanceof C16823j) {
            c16823j = (C16823j) abstractC19687c;
            i12 = c16823j.f53980t0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                int i13 = i12 - Integer.MIN_VALUE;
                c16823j.f53980t0 = i13;
                i11 = i13;
            } else {
                c16823j = new C16823j(c16826m5, abstractC19687c);
                i11 = i12;
            }
        } else {
            c16823j = new C16823j(c16826m5, abstractC19687c);
            i11 = i12;
        }
        C16823j c16823j2 = c16823j;
        Object obj2 = c16823j2.f53978r0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i14 = c16823j2.f53980t0;
        if (i14 != 0) {
            try {
                if (i14 == 1) {
                    C16816c c16816c5 = c16823j2.f53976p0;
                    C20831i c20831i6 = c16823j2.f53975o0;
                    InterfaceC20837o interfaceC20837o4 = c16823j2.f53974Z;
                    C16826m c16826m6 = c16823j2.f53973Y;
                    AbstractC9233X.m9807c(obj2);
                    c16816c = c16816c5;
                    c16826m2 = c16826m6;
                    c20831i5 = c20831i6;
                    interfaceC20837o3 = interfaceC20837o4;
                    c16826m2 = c16826m5;
                    c16816c = c16816c4;
                    c20831i5 = c20831iM21435a;
                    interfaceC20837o3 = c20840r;
                    c16826m2 = c16826m5;
                    c16816c = c16816c4;
                    c20831i5 = c20831iM21435a;
                    interfaceC20837o3 = c20840r;
                    c16826m2 = c16826m5;
                    c16816c = c16816c4;
                    c20831i5 = c20831iM21435a;
                    interfaceC20837o3 = c20840r;
                    if (((C20118c) c16826m2.f53990c.getValue()) != null) {
                        c20831i5.getClass();
                    }
                    drawableM1000b = AbstractC0369d.m1000b(c20831i5, c20831i5.f66207B, c20831i5.f66206A, c20831i5.f66209D.f66170j);
                    interfaceC21389b2 = c20831i5.f66212c;
                    if (interfaceC21389b2 != null) {
                        interfaceC21389b2.mo10669n(drawableM1000b);
                    }
                    c16816c.getClass();
                    InterfaceC21130i interfaceC21130i = c20831i5.f66233x;
                    c16823j2.f53973Y = c16826m2;
                    c16823j2.f53974Z = interfaceC20837o3;
                    c16823j2.f53975o0 = c20831i5;
                    c16823j2.f53976p0 = c16816c;
                    c16823j2.f53977q0 = null;
                    c16823j2.f53980t0 = 2;
                    objMo10210a = interfaceC21130i.mo10210a(c16823j2);
                    if (objMo10210a == enumC19250a) {
                        obj = enumC19250a;
                    } else {
                        bitmap = null;
                        c16826m3 = c16826m2;
                        c16816c2 = c16816c;
                        c20831i4 = c20831i5;
                        interfaceC20837o2 = interfaceC20837o3;
                        C21129h c21129h = (C21129h) objMo10210a;
                        c16816c2.getClass();
                        AbstractC0563B abstractC0563B = c20831i4.f66228s;
                        C16824k c16824k = new C16824k(c20831i4, c16826m3, c21129h, c16816c2, bitmap, null);
                        c16823j2.f53973Y = c16826m3;
                        c16823j2.f53974Z = interfaceC20837o2;
                        c16823j2.f53975o0 = c20831i4;
                        c16823j2.f53976p0 = c16816c2;
                        c16823j2.f53977q0 = null;
                        c16823j2.f53980t0 = 3;
                        objM1168P = AbstractC0575H.m1168P(abstractC0563B, c16824k, c16823j2);
                        c16826m4 = c16826m3;
                        c16816c3 = c16816c2;
                        c20831i2 = c20831i4;
                        interfaceC20837o = interfaceC20837o2;
                        if (objM1168P == enumC19250a) {
                            obj = enumC19250a;
                        }
                    }
                } else if (i14 == 2) {
                    Bitmap bitmap2 = c16823j2.f53977q0;
                    C16816c c16816c6 = c16823j2.f53976p0;
                    C20831i c20831i7 = c16823j2.f53975o0;
                    InterfaceC20837o interfaceC20837o5 = c16823j2.f53974Z;
                    C16826m c16826m7 = c16823j2.f53973Y;
                    AbstractC9233X.m9807c(obj2);
                    bitmap = bitmap2;
                    objMo10210a = obj2;
                    c16816c2 = c16816c6;
                    c16826m3 = c16826m7;
                    c20831i4 = c20831i7;
                    interfaceC20837o2 = interfaceC20837o5;
                    C21129h c21129h2 = (C21129h) objMo10210a;
                    c16816c2.getClass();
                    AbstractC0563B abstractC0563B2 = c20831i4.f66228s;
                    C16824k c16824k2 = new C16824k(c20831i4, c16826m3, c21129h2, c16816c2, bitmap, null);
                    c16823j2.f53973Y = c16826m3;
                    c16823j2.f53974Z = interfaceC20837o2;
                    c16823j2.f53975o0 = c20831i4;
                    c16823j2.f53976p0 = c16816c2;
                    c16823j2.f53977q0 = null;
                    c16823j2.f53980t0 = 3;
                    objM1168P = AbstractC0575H.m1168P(abstractC0563B2, c16824k2, c16823j2);
                    c16826m4 = c16826m3;
                    c16816c3 = c16816c2;
                    c20831i2 = c20831i4;
                    interfaceC20837o = interfaceC20837o2;
                    if (objM1168P == enumC19250a) {
                        obj = enumC19250a;
                    }
                } else {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C16816c c16816c7 = c16823j2.f53976p0;
                    C20831i c20831i8 = c16823j2.f53975o0;
                    InterfaceC20837o interfaceC20837o6 = c16823j2.f53974Z;
                    C16826m c16826m8 = c16823j2.f53973Y;
                    AbstractC9233X.m9807c(obj2);
                    objM1168P = obj2;
                    c16816c3 = c16816c7;
                    c16826m4 = c16826m8;
                    c20831i2 = c20831i8;
                    interfaceC20837o = interfaceC20837o6;
                }
                abstractC20832j2 = (AbstractC20832j) objM1168P;
                if (abstractC20832j2 instanceof C20838p) {
                    c20838p = (C20838p) abstractC20832j2;
                    interfaceC21389b = c20831i2.f66212c;
                    c16826m4.getClass();
                    c20831i3 = c20838p.f66256b;
                    z6 = interfaceC21389b instanceof InterfaceC21803g;
                    drawable = c20838p.f66255a;
                    if (z6) {
                        interfaceC21802fMo22287a = c20831i3.f66218i.mo22287a((InterfaceC21803g) interfaceC21389b, c20838p);
                        if (interfaceC21802fMo22287a instanceof C21800d) {
                            interfaceC21389b.mo10667k(drawable);
                        } else {
                            c16816c3.getClass();
                            interfaceC21802fMo22287a.mo22288a();
                        }
                    } else if (interfaceC21389b != null) {
                        interfaceC21389b.mo10667k(drawable);
                    }
                    c16816c3.getClass();
                    c20831i3.getClass();
                    r13 = interfaceC20837o;
                    abstractC20832j = abstractC20832j2;
                } else {
                    if (!(abstractC20832j2 instanceof C20827e)) {
                        throw new C0644w();
                    }
                    InterfaceC21389b interfaceC21389b3 = c20831i2.f66212c;
                    c16826m4.getClass();
                    m18563c((C20827e) abstractC20832j2, interfaceC21389b3, c16816c3);
                    r13 = interfaceC20837o;
                    abstractC20832j = abstractC20832j2;
                }
            } catch (Throwable th2) {
                th = th2;
                r6 = c16826m5;
                r10 = -2147483648;
                r12 = i14;
                r11 = i11;
                try {
                    if (!(th instanceof CancellationException)) {
                        r10.getClass();
                        r6.getClass();
                        r12.getClass();
                        throw th;
                    }
                    r10.f53994g.getClass();
                    C20827e c20827eM21132b = C20485c.m21132b(r12, th);
                    m18563c(c20827eM21132b, r12.f66212c, r6);
                    r13 = r11;
                    abstractC20832j = c20827eM21132b;
                } catch (Throwable th3) {
                    r11.mo21432m();
                    throw th3;
                }
            }
            r13.mo21432m();
            obj = abstractC20832j;
        } else {
            AbstractC9233X.m9807c(obj2);
            InterfaceC0627n0 interfaceC0627n0M1192u = AbstractC0575H.m1192u(c16823j2.getContext());
            C20485c c20485c = c16826m5.f53994g;
            c20485c.getClass();
            AbstractC11105n abstractC11105n = c20831i.f66232w;
            InterfaceC21389b interfaceC21389b4 = c20831i.f66212c;
            c20840r = interfaceC21389b4 instanceof C21388a ? new C20840r((C16826m) c20485c.f65029a, c20831i, (C21388a) interfaceC21389b4, abstractC11105n, interfaceC0627n0M1192u) : new C20823a(abstractC11105n, interfaceC0627n0M1192u);
            c20840r.mo21431e();
            C20830h c20830hM21439a = C20831i.m21439a(c20831i);
            c20830hM21439a.f66186b = c16826m5.f53989b;
            c20830hM21439a.f66205u = null;
            c20831iM21435a = c20830hM21439a.m21435a();
            c16816c4 = C16816c.f53957a;
            try {
                if (c20831iM21435a.f66211b == C20833k.f66236b) {
                    throw new C20834l("The request's data is null.");
                }
                c20840r.start();
                if (i10 == 0) {
                    AbstractC11105n abstractC11105n2 = c20831iM21435a.f66232w;
                    c16823j2.f53973Y = c16826m5;
                    c16823j2.f53974Z = c20840r;
                    c16823j2.f53975o0 = c20831iM21435a;
                    c16823j2.f53976p0 = c16816c4;
                    c16823j2.f53980t0 = 1;
                    if (AbstractC7360k.m7785b(abstractC11105n2, c16823j2) == enumC19250a) {
                        c16826m2 = c16826m5;
                        c16816c = c16816c4;
                        c20831i5 = c20831iM21435a;
                        interfaceC20837o3 = c20840r;
                        c16826m2 = c16826m5;
                        c16816c = c16816c4;
                        c20831i5 = c20831iM21435a;
                        interfaceC20837o3 = c20840r;
                        obj = enumC19250a;
                    } else {
                        c16826m2 = c16826m5;
                        c16816c = c16816c4;
                        c20831i5 = c20831iM21435a;
                        interfaceC20837o3 = c20840r;
                        c16826m2 = c16826m5;
                        c16816c = c16816c4;
                        c20831i5 = c20831iM21435a;
                        interfaceC20837o3 = c20840r;
                        c16826m2 = c16826m5;
                        c16816c = c16816c4;
                        c20831i5 = c20831iM21435a;
                        interfaceC20837o3 = c20840r;
                        if (((C20118c) c16826m2.f53990c.getValue()) != null) {
                            c20831i5.getClass();
                        }
                        drawableM1000b = AbstractC0369d.m1000b(c20831i5, c20831i5.f66207B, c20831i5.f66206A, c20831i5.f66209D.f66170j);
                        interfaceC21389b2 = c20831i5.f66212c;
                        if (interfaceC21389b2 != null) {
                            interfaceC21389b2.mo10669n(drawableM1000b);
                        }
                        c16816c.getClass();
                        InterfaceC21130i interfaceC21130i2 = c20831i5.f66233x;
                        c16823j2.f53973Y = c16826m2;
                        c16823j2.f53974Z = interfaceC20837o3;
                        c16823j2.f53975o0 = c20831i5;
                        c16823j2.f53976p0 = c16816c;
                        c16823j2.f53977q0 = null;
                        c16823j2.f53980t0 = 2;
                        objMo10210a = interfaceC21130i2.mo10210a(c16823j2);
                        if (objMo10210a == enumC19250a) {
                            obj = enumC19250a;
                        } else {
                            bitmap = null;
                            c16826m3 = c16826m2;
                            c16816c2 = c16816c;
                            c20831i4 = c20831i5;
                            interfaceC20837o2 = interfaceC20837o3;
                            C21129h c21129h3 = (C21129h) objMo10210a;
                            c16816c2.getClass();
                            AbstractC0563B abstractC0563B3 = c20831i4.f66228s;
                            C16824k c16824k3 = new C16824k(c20831i4, c16826m3, c21129h3, c16816c2, bitmap, null);
                            c16823j2.f53973Y = c16826m3;
                            c16823j2.f53974Z = interfaceC20837o2;
                            c16823j2.f53975o0 = c20831i4;
                            c16823j2.f53976p0 = c16816c2;
                            c16823j2.f53977q0 = null;
                            c16823j2.f53980t0 = 3;
                            objM1168P = AbstractC0575H.m1168P(abstractC0563B3, c16824k3, c16823j2);
                            c16826m4 = c16826m3;
                            c16816c3 = c16816c2;
                            c20831i2 = c20831i4;
                            interfaceC20837o = interfaceC20837o2;
                            if (objM1168P == enumC19250a) {
                                obj = enumC19250a;
                            } else {
                                abstractC20832j2 = (AbstractC20832j) objM1168P;
                                if (abstractC20832j2 instanceof C20838p) {
                                    c20838p = (C20838p) abstractC20832j2;
                                    interfaceC21389b = c20831i2.f66212c;
                                    c16826m4.getClass();
                                    c20831i3 = c20838p.f66256b;
                                    z6 = interfaceC21389b instanceof InterfaceC21803g;
                                    drawable = c20838p.f66255a;
                                    if (z6) {
                                        interfaceC21802fMo22287a = c20831i3.f66218i.mo22287a((InterfaceC21803g) interfaceC21389b, c20838p);
                                        if (interfaceC21802fMo22287a instanceof C21800d) {
                                            interfaceC21389b.mo10667k(drawable);
                                        } else {
                                            c16816c3.getClass();
                                            interfaceC21802fMo22287a.mo22288a();
                                        }
                                    } else if (interfaceC21389b != null) {
                                        interfaceC21389b.mo10667k(drawable);
                                    }
                                    c16816c3.getClass();
                                    c20831i3.getClass();
                                    r13 = interfaceC20837o;
                                    abstractC20832j = abstractC20832j2;
                                } else {
                                    if (!(abstractC20832j2 instanceof C20827e)) {
                                        throw new C0644w();
                                    }
                                    InterfaceC21389b interfaceC21389b5 = c20831i2.f66212c;
                                    c16826m4.getClass();
                                    m18563c((C20827e) abstractC20832j2, interfaceC21389b5, c16816c3);
                                    r13 = interfaceC20837o;
                                    abstractC20832j = abstractC20832j2;
                                }
                                r13.mo21432m();
                                obj = abstractC20832j;
                            }
                        }
                    }
                } else {
                    c16826m2 = c16826m5;
                    c16816c = c16816c4;
                    c20831i5 = c20831iM21435a;
                    interfaceC20837o3 = c20840r;
                    c16826m2 = c16826m5;
                    c16816c = c16816c4;
                    c20831i5 = c20831iM21435a;
                    interfaceC20837o3 = c20840r;
                    c16826m2 = c16826m5;
                    c16816c = c16816c4;
                    c20831i5 = c20831iM21435a;
                    interfaceC20837o3 = c20840r;
                    if (((C20118c) c16826m2.f53990c.getValue()) != null) {
                        c20831i5.getClass();
                    }
                    drawableM1000b = AbstractC0369d.m1000b(c20831i5, c20831i5.f66207B, c20831i5.f66206A, c20831i5.f66209D.f66170j);
                    interfaceC21389b2 = c20831i5.f66212c;
                    if (interfaceC21389b2 != null) {
                        interfaceC21389b2.mo10669n(drawableM1000b);
                    }
                    c16816c.getClass();
                    InterfaceC21130i interfaceC21130i3 = c20831i5.f66233x;
                    c16823j2.f53973Y = c16826m2;
                    c16823j2.f53974Z = interfaceC20837o3;
                    c16823j2.f53975o0 = c20831i5;
                    c16823j2.f53976p0 = c16816c;
                    c16823j2.f53977q0 = null;
                    c16823j2.f53980t0 = 2;
                    objMo10210a = interfaceC21130i3.mo10210a(c16823j2);
                    if (objMo10210a == enumC19250a) {
                        obj = enumC19250a;
                    } else {
                        bitmap = null;
                        c16826m3 = c16826m2;
                        c16816c2 = c16816c;
                        c20831i4 = c20831i5;
                        interfaceC20837o2 = interfaceC20837o3;
                        C21129h c21129h4 = (C21129h) objMo10210a;
                        c16816c2.getClass();
                        AbstractC0563B abstractC0563B4 = c20831i4.f66228s;
                        C16824k c16824k4 = new C16824k(c20831i4, c16826m3, c21129h4, c16816c2, bitmap, null);
                        c16823j2.f53973Y = c16826m3;
                        c16823j2.f53974Z = interfaceC20837o2;
                        c16823j2.f53975o0 = c20831i4;
                        c16823j2.f53976p0 = c16816c2;
                        c16823j2.f53977q0 = null;
                        c16823j2.f53980t0 = 3;
                        objM1168P = AbstractC0575H.m1168P(abstractC0563B4, c16824k4, c16823j2);
                        c16826m4 = c16826m3;
                        c16816c3 = c16816c2;
                        c20831i2 = c20831i4;
                        interfaceC20837o = interfaceC20837o2;
                        if (objM1168P == enumC19250a) {
                            obj = enumC19250a;
                        } else {
                            abstractC20832j2 = (AbstractC20832j) objM1168P;
                            if (abstractC20832j2 instanceof C20838p) {
                                c20838p = (C20838p) abstractC20832j2;
                                interfaceC21389b = c20831i2.f66212c;
                                c16826m4.getClass();
                                c20831i3 = c20838p.f66256b;
                                z6 = interfaceC21389b instanceof InterfaceC21803g;
                                drawable = c20838p.f66255a;
                                if (z6) {
                                    interfaceC21802fMo22287a = c20831i3.f66218i.mo22287a((InterfaceC21803g) interfaceC21389b, c20838p);
                                    if (interfaceC21802fMo22287a instanceof C21800d) {
                                        interfaceC21389b.mo10667k(drawable);
                                    } else {
                                        c16816c3.getClass();
                                        interfaceC21802fMo22287a.mo22288a();
                                    }
                                } else if (interfaceC21389b != null) {
                                    interfaceC21389b.mo10667k(drawable);
                                }
                                c16816c3.getClass();
                                c20831i3.getClass();
                                r13 = interfaceC20837o;
                                abstractC20832j = abstractC20832j2;
                            } else {
                                if (!(abstractC20832j2 instanceof C20827e)) {
                                    throw new C0644w();
                                }
                                InterfaceC21389b interfaceC21389b6 = c20831i2.f66212c;
                                c16826m4.getClass();
                                m18563c((C20827e) abstractC20832j2, interfaceC21389b6, c16816c3);
                                r13 = interfaceC20837o;
                                abstractC20832j = abstractC20832j2;
                            }
                            r13.mo21432m();
                            obj = abstractC20832j;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                r10 = c16826m5;
                r6 = c16816c4;
                r12 = c20831iM21435a;
                r11 = c20840r;
                if (!(th instanceof CancellationException)) {
                    r10.getClass();
                    r6.getClass();
                    r12.getClass();
                    throw th;
                }
                r10.f53994g.getClass();
                C20827e c20827eM21132b2 = C20485c.m21132b(r12, th);
                m18563c(c20827eM21132b2, r12.f66212c, r6);
                r13 = r11;
                abstractC20832j = c20827eM21132b2;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: c */
    public static void m18563c(C20827e c20827e, InterfaceC21389b interfaceC21389b, C16816c c16816c) {
        C20831i c20831i = c20827e.f66181b;
        boolean z6 = interfaceC21389b instanceof InterfaceC21803g;
        Drawable drawable = c20827e.f66180a;
        if (z6) {
            InterfaceC21802f interfaceC21802fMo22287a = c20831i.f66218i.mo22287a((InterfaceC21803g) interfaceC21389b, c20827e);
            if (interfaceC21802fMo22287a instanceof C21800d) {
                interfaceC21389b.mo10668l(drawable);
            } else {
                c16816c.getClass();
                interfaceC21802fMo22287a.mo22288a();
            }
        } else if (interfaceC21389b != null) {
            interfaceC21389b.mo10668l(drawable);
        }
        c16816c.getClass();
        c20831i.getClass();
    }

    /* JADX INFO: renamed from: b */
    public final C20833k m18564b(C20831i c20831i) {
        AbstractC0575H.m1177f(this.f53992e, null, new C16819f(this, null, c20831i), 3);
        InterfaceC21389b interfaceC21389b = c20831i.f66212c;
        return interfaceC21389b instanceof C21388a ? AbstractC0371f.m1003c(((C21388a) interfaceC21389b).f67898Z).m21441b() : new C20833k(1);
    }
}
