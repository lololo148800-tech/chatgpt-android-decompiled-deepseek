package p470T4;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: T4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7236a {

    /* JADX INFO: renamed from: a */
    public static final C7236a f22943a = new C7236a();

    /* JADX INFO: renamed from: a */
    public final File m7638a(Context context) {
        AbstractC16544l.m18094g(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        AbstractC16544l.m18093f(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
