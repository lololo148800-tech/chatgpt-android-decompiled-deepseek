package wf;

import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.SQLException;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.openai.files.ChatFileProvider;
import io.sentry.instrumentation.file.C15379d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p037B9.MeDP.MpoABj;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1113xn.AbstractC21322p;
import p1155zi.C21941M1;
import p1155zi.C21945N1;
import p1155zi.C21952P1;
import p523V9.AbstractC7942M5;
import p544W9.AbstractC8752z3;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17678l;
import p913o2.AbstractC17806g;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: wf.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C20944d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C20945e f66716Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f66717Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC16546n f66718o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20944d(C20945e c20945e, String str, InterfaceC1436k interfaceC1436k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f66716Y = c20945e;
        this.f66717Z = str;
        this.f66718o0 = (AbstractC16546n) interfaceC1436k;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20944d(this.f66716Y, this.f66717Z, this.f66718o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20944d) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Uri uriForFile;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        try {
            int i10 = Build.VERSION.SDK_INT;
            ?? r6 = this.f66718o0;
            C20945e c20945e = this.f66716Y;
            String str = this.f66717Z;
            Application application = c20945e.f66719a;
            if (i10 < 29) {
                File[] externalMediaDirs = application.getExternalMediaDirs();
                AbstractC16544l.m18093f(externalMediaDirs, "getExternalMediaDirs(...)");
                File file = (File) AbstractC17678l.m19317x(externalMediaDirs);
                if (file == null) {
                    return new C21941M1(new RuntimeException("No external directory"));
                }
                File file2 = new File(file, str);
                C15379d c15379dM9509d = AbstractC8752z3.m9509d(new FileOutputStream(file2), file2);
                try {
                    r6.invoke(c15379dM9509d);
                    AbstractC7942M5.m8232a(c15379dM9509d, null);
                    MediaScannerConnection.scanFile(application, new String[]{file2.getAbsolutePath()}, null, null);
                    try {
                        int i11 = ChatFileProvider.f40341Y;
                        uriForFile = AbstractC17806g.getUriForFile(application, application.getPackageName() + ".files", file2);
                    } catch (IllegalArgumentException e10) {
                        return new C21941M1(e10);
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC7942M5.m8232a(c15379dM9509d, th2);
                        throw th3;
                    }
                }
            } else {
                EnumC20941a[] enumC20941aArr = EnumC20941a.f66706Y;
                String str2 = AbstractC21322p.m21667A(str, "webp", false) ? "image/webp" : "image/jpg";
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", str2);
                contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
                contentValues.put("is_pending", new Integer(1));
                ContentResolver contentResolver = application.getContentResolver();
                Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                if (uriInsert == null) {
                    return new C21941M1(new RuntimeException(MpoABj.Ohj));
                }
                OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                if (outputStreamOpenOutputStream == null) {
                    return new C21945N1(new RuntimeException("Failed to open output stream"));
                }
                try {
                    r6.invoke(outputStreamOpenOutputStream);
                    AbstractC7942M5.m8232a(outputStreamOpenOutputStream, null);
                    contentValues.clear();
                    contentValues.put("is_pending", new Integer(0));
                    contentResolver.update(uriInsert, contentValues, null, null);
                    uriForFile = uriInsert;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        AbstractC7942M5.m8232a(outputStreamOpenOutputStream, th4);
                        throw th5;
                    }
                }
            }
            return new C21952P1(uriForFile);
        } catch (SQLException e11) {
            return new C21945N1(e11);
        } catch (IOException e12) {
            return new C21945N1(e12);
        }
    }
}
