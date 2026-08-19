package p1018t5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17349p;
import p007A5.AbstractC0371f;
import p1075w5.C20835m;
import p1113xn.AbstractC21322p;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: t5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C19801a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62823a;

    public /* synthetic */ C19801a(int i10) {
        this.f62823a = i10;
    }

    /* JADX INFO: renamed from: a */
    public final Object m20762a(Object obj, C20835m c20835m) throws PackageManager.NameNotFoundException {
        String authority;
        switch (this.f62823a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (AbstractC0371f.m1004d(uri)) {
                    return null;
                }
                String scheme = uri.getScheme();
                if (scheme != null && !scheme.equals("file")) {
                    return null;
                }
                String path = uri.getPath();
                if (path == null) {
                    path = "";
                }
                if (!AbstractC21322p.m21698f0(path, '/') || ((String) AbstractC17680n.m19343S(uri.getPathSegments())) == null) {
                    return null;
                }
                if (!AbstractC16544l.m18089b(uri.getScheme(), "file")) {
                    return new File(uri.toString());
                }
                String path2 = uri.getPath();
                if (path2 != null) {
                    return new File(path2);
                }
                return null;
            case 2:
                return ((C17349p) obj).f55294i;
            case 3:
                Context context = c20835m.f66238a;
                int iIntValue = ((Number) obj).intValue();
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            case 4:
                Uri uri2 = (Uri) obj;
                if (!AbstractC16544l.m18089b(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || AbstractC21322p.m21681O(authority) || uri2.getPathSegments().size() != 2) {
                    return null;
                }
                String authority2 = uri2.getAuthority();
                if (authority2 == null) {
                    authority2 = "";
                }
                Resources resourcesForApplication = c20835m.f66238a.getPackageManager().getResourcesForApplication(authority2);
                List<String> pathSegments = uri2.getPathSegments();
                int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                if (identifier == 0) {
                    throw new IllegalStateException(("Invalid android.resource URI: " + uri2).toString());
                }
                return Uri.parse("android.resource://" + authority2 + '/' + identifier);
            default:
                return Uri.parse((String) obj);
        }
    }
}
