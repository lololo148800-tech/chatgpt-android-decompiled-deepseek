package p913o2;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import io.sentry.android.core.performance.C15251d;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import p509Uk.lpqL.SfpOlmlMATQ;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o2.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17806g extends ContentProvider {
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String DISPLAYNAME_FIELD = "displayName";
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";
    private String mAuthority;
    private InterfaceC17804e mLocalPathStrategy;
    private final Object mLock = new Object();
    private final int mResourceId;
    private static final String[] COLUMNS = {"_display_name", "_size"};
    private static final File DEVICE_ROOT = new File(Separators.SLASH);
    private static final HashMap<String, InterfaceC17804e> sCache = new HashMap<>();

    public AbstractC17806g(int i10) {
        this.mResourceId = i10;
    }

    public static String access$000(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC17804e m19561b(int i10, Context context, String str) {
        InterfaceC17804e interfaceC17804eM19562c;
        HashMap<String, InterfaceC17804e> map = sCache;
        synchronized (map) {
            try {
                interfaceC17804eM19562c = map.get(str);
                if (interfaceC17804eM19562c == null) {
                    try {
                        try {
                            interfaceC17804eM19562c = m19562c(i10, context, str);
                            map.put(str, interfaceC17804eM19562c);
                        } catch (IOException e10) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e10);
                        }
                    } catch (XmlPullParserException e11) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e11);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC17804eM19562c;
    }

    /* JADX INFO: renamed from: c */
    public static C17805f m19562c(int i10, Context context, String str) throws XmlPullParserException, IOException {
        C17805f c17805f = new C17805f(str);
        XmlResourceParser fileProviderPathsMetaData = getFileProviderPathsMetaData(context, str, context.getPackageManager().resolveContentProvider(str, 128), i10);
        while (true) {
            int next = fileProviderPathsMetaData.next();
            if (next == 1) {
                return c17805f;
            }
            if (next == 2) {
                String name = fileProviderPathsMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = fileProviderPathsMetaData.getAttributeValue(null, "name");
                String attributeValue2 = fileProviderPathsMetaData.getAttributeValue(null, ATTR_PATH);
                if (TAG_ROOT_PATH.equals(name)) {
                    externalStorageDirectory = DEVICE_ROOT;
                } else if (TAG_FILES_PATH.equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if (TAG_CACHE_PATH.equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if (TAG_EXTERNAL.equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if (TAG_EXTERNAL_FILES.equals(name)) {
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs.length > 0) {
                        externalStorageDirectory = externalFilesDirs[0];
                    }
                } else if (TAG_EXTERNAL_CACHE.equals(name)) {
                    File[] externalCacheDirs = context.getExternalCacheDirs();
                    if (externalCacheDirs.length > 0) {
                        externalStorageDirectory = externalCacheDirs[0];
                    }
                } else if (TAG_EXTERNAL_MEDIA.equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        externalStorageDirectory = externalMediaDirs[0];
                    }
                }
                if (externalStorageDirectory == null) {
                    continue;
                } else {
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        externalStorageDirectory = new File(externalStorageDirectory, str2);
                    }
                    if (TextUtils.isEmpty(attributeValue)) {
                        throw new IllegalArgumentException("Name must not be empty");
                    }
                    try {
                        c17805f.f56792b.put(attributeValue, externalStorageDirectory.getCanonicalFile());
                    } catch (IOException e10) {
                        throw new IllegalArgumentException("Failed to resolve canonical path for " + externalStorageDirectory, e10);
                    }
                }
            }
        }
    }

    public static XmlResourceParser getFileProviderPathsMetaData(Context context, String str, ProviderInfo providerInfo, int i10) {
        if (providerInfo == null) {
            throw new IllegalArgumentException(AbstractC9306j0.m9889h("Couldn't find meta-data for provider with authority ", str));
        }
        if (providerInfo.metaData == null && i10 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt(META_DATA_FILE_PROVIDER_PATHS, i10);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    public static Uri getUriForFile(Context context, String str, File file) {
        C17805f c17805f = (C17805f) m19561b(0, context, str);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : c17805f.f56792b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (C17805f.m19559a(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new IllegalArgumentException(AbstractC9306j0.m9889h("Failed to find configured root that contains ", canonicalPath));
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme("content").authority(c17805f.f56791a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith(Separators.SLASH) ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), Separators.SLASH)).build();
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC17804e m19563a() {
        InterfaceC17804e interfaceC17804e;
        synchronized (this.mLock) {
            try {
                if (this.mAuthority == null) {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
                if (this.mLocalPathStrategy == null) {
                    this.mLocalPathStrategy = m19561b(this.mResourceId, getContext(), this.mAuthority);
                }
                interfaceC17804e = this.mLocalPathStrategy;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC17804e;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(Separators.SEMICOLON)[0];
        synchronized (this.mLock) {
            this.mAuthority = str;
        }
        HashMap<String, InterfaceC17804e> map = sCache;
        synchronized (map) {
            map.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return ((C17805f) m19563a()).m19560b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File fileM19560b = ((C17805f) m19563a()).m19560b(uri);
        int iLastIndexOf = fileM19560b.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileM19560b.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        C15251d.m16452c(this);
        C15251d.m16453d(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i10;
        File fileM19560b = ((C17805f) m19563a()).m19560b(uri);
        if ("r".equals(str)) {
            i10 = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i10 = 738197504;
        } else if ("wa".equals(str)) {
            i10 = 704643072;
        } else if ("rw".equals(str)) {
            i10 = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException(AbstractC9306j0.m9889h("Invalid mode: ", str));
            }
            i10 = 1006632960;
        }
        return ParcelFileDescriptor.open(fileM19560b, i10);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i10;
        String name;
        File fileM19560b = ((C17805f) m19563a()).m19560b(uri);
        String queryParameter = uri.getQueryParameter(DISPLAYNAME_FIELD);
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i11 = 0;
        for (String str3 : strArr) {
            String str4 = SfpOlmlMATQ.MqHtoOjUQgeCMed;
            if (str4.equals(str3)) {
                strArr3[i11] = str4;
                i10 = i11 + 1;
                if (queryParameter == null) {
                    name = fileM19560b.getName();
                } else {
                    name = queryParameter;
                }
                objArr[i11] = name;
            } else {
                if ("_size".equals(str3)) {
                    strArr3[i11] = "_size";
                    i10 = i11 + 1;
                    objArr[i11] = Long.valueOf(fileM19560b.length());
                }
            }
            i11 = i10;
        }
        String[] strArr4 = new String[i11];
        System.arraycopy(strArr3, 0, strArr4, 0, i11);
        Object[] objArr2 = new Object[i11];
        System.arraycopy(objArr, 0, objArr2, 0, i11);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    public static Uri getUriForFile(Context context, String str, File file, String str2) {
        return getUriForFile(context, str, file).buildUpon().appendQueryParameter(DISPLAYNAME_FIELD, str2).build();
    }
}
