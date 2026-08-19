package p913o2;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: o2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C17805f implements InterfaceC17804e {

    /* JADX INFO: renamed from: a */
    public final String f56791a;

    /* JADX INFO: renamed from: b */
    public final HashMap f56792b = new HashMap();

    public C17805f(String str) {
        this.f56791a = str;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m19559a(String str, String str2) {
        String strAccess$000 = AbstractC17806g.access$000(str);
        String strAccess$001 = AbstractC17806g.access$000(str2);
        if (!strAccess$000.equals(strAccess$001)) {
            if (!strAccess$000.startsWith(strAccess$001 + '/')) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final File m19560b(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
        File file = (File) this.f56792b.get(strDecode);
        if (file == null) {
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }
        File file2 = new File(file, strDecode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (m19559a(canonicalFile.getPath(), file.getPath())) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
        }
    }
}
