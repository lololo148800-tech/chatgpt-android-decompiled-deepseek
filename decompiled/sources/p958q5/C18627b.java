package p958q5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.MediaStreamTrack;
import org.xmlpull.v1.XmlPullParserException;
import p007A5.AbstractC0371f;
import p026Ao.AbstractC0668b;
import p1075w5.C20835m;
import p1098x5.C21122a;
import p1098x5.C21129h;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p353O4.C6119f;
import p353O4.C6130q;
import p523V9.AbstractC7870D5;
import p523V9.AbstractC8020X;
import p571X9.AbstractC9106B3;
import p899n5.C17484a;
import p899n5.C17498o;
import p899n5.C17499p;
import p899n5.C17500q;
import p899n5.EnumC17488e;
import p909nm.AbstractC17680n;
import p955q2.AbstractC18619k;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: q5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C18627b implements InterfaceC18632g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59347a;

    /* JADX INFO: renamed from: b */
    public final Uri f59348b;

    /* JADX INFO: renamed from: c */
    public final C20835m f59349c;

    public /* synthetic */ C18627b(Uri uri, C20835m c20835m, int i10) {
        this.f59347a = i10;
        this.f59348b = uri;
        this.f59349c = c20835m;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:53:0x0122  */
    /* JADX WARN: Code duplicated, block: B:96:0x0239  */
    @Override // p958q5.InterfaceC18632g
    /* JADX INFO: renamed from: a */
    public final Object mo19985a(InterfaceC18770c interfaceC18770c) throws XmlPullParserException, IOException {
        InputStream inputStreamOpenInputStream;
        List<String> pathSegments;
        int size;
        Bundle bundle;
        Integer numM21736w;
        Drawable drawable;
        Drawable c6119f;
        boolean z6 = true;
        C20835m c20835m = this.f59349c;
        Uri uri = this.f59348b;
        switch (this.f59347a) {
            case 0:
                String strM19349Y = AbstractC17680n.m19349Y(AbstractC17680n.m19336L(uri.getPathSegments(), 1), Separators.SLASH, null, null, 0, null, null, 62);
                return new C18638m(new C17500q(AbstractC0668b.m1403c(AbstractC0668b.m1410j(c20835m.f66238a.getAssets().open(strM19349Y))), new C17498o(c20835m.f66238a, 0), new C17484a()), AbstractC0371f.m1002b(MimeTypeMap.getSingleton(), strM19349Y), EnumC17488e.f55953o0);
            case 1:
                ContentResolver contentResolver = c20835m.f66238a.getContentResolver();
                if (AbstractC16544l.m18089b(uri.getAuthority(), "com.android.contacts") && AbstractC16544l.m18089b(uri.getLastPathSegment(), "display_photo")) {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException(("Unable to find a contact photo associated with '" + uri + "'.").toString());
                    }
                } else if (Build.VERSION.SDK_INT >= 29 && AbstractC16544l.m18089b(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && AbstractC16544l.m18089b(pathSegments.get(size - 3), MediaStreamTrack.AUDIO_TRACK_KIND) && AbstractC16544l.m18089b(pathSegments.get(size - 2), "albums")) {
                    C21129h c21129h = c20835m.f66241d;
                    AbstractC7870D5 abstractC7870D5 = c21129h.f67132a;
                    C21122a c21122a = abstractC7870D5 instanceof C21122a ? (C21122a) abstractC7870D5 : null;
                    if (c21122a != null) {
                        AbstractC7870D5 abstractC7870D6 = c21129h.f67133b;
                        C21122a c21122a2 = abstractC7870D6 instanceof C21122a ? (C21122a) abstractC7870D6 : null;
                        if (c21122a2 != null) {
                            bundle = new Bundle(1);
                            bundle.putParcelable("android.content.extra.SIZE", new Point(c21122a.f67118b, c21122a2.f67118b));
                        } else {
                            bundle = null;
                        }
                    } else {
                        bundle = null;
                    }
                    AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                    inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uri + "'.").toString());
                    }
                } else {
                    inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException(("Unable to open '" + uri + "'.").toString());
                    }
                }
                return new C18638m(new C17500q(AbstractC0668b.m1403c(AbstractC0668b.m1410j(inputStreamOpenInputStream)), new C17498o(c20835m.f66238a, 0), new C17484a()), contentResolver.getType(uri), EnumC17488e.f55953o0);
            default:
                String authority = uri.getAuthority();
                if (authority != null) {
                    String str = AbstractC21322p.m21681O(authority) ? null : authority;
                    if (str != null) {
                        String str2 = (String) AbstractC17680n.m19353c0(uri.getPathSegments());
                        if (str2 == null || (numM21736w = AbstractC21329w.m21736w(str2)) == null) {
                            throw new IllegalStateException("Invalid android.resource URI: " + uri);
                        }
                        int iIntValue = numM21736w.intValue();
                        Context context = c20835m.f66238a;
                        Resources resources = str.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        CharSequence charSequence = typedValue.string;
                        String strM1002b = AbstractC0371f.m1002b(MimeTypeMap.getSingleton(), charSequence.subSequence(AbstractC21322p.m21683Q(charSequence, '/', 0, 6), charSequence.length()).toString());
                        if (!AbstractC16544l.m18089b(strM1002b, "text/xml")) {
                            TypedValue typedValue2 = new TypedValue();
                            return new C18638m(new C17500q(AbstractC0668b.m1403c(AbstractC0668b.m1410j(resources.openRawResource(iIntValue, typedValue2))), new C17498o(context, 0), new C17499p(typedValue2.density)), strM1002b, EnumC17488e.f55953o0);
                        }
                        if (str.equals(context.getPackageName())) {
                            drawable = AbstractC9106B3.m9636b(context, iIntValue);
                            if (drawable == null) {
                                throw new IllegalStateException(AbstractC10763a.m11048f(iIntValue, "Invalid resource ID: ").toString());
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            if (Build.VERSION.SDK_INT < 24) {
                                String name = xml.getName();
                                if (AbstractC16544l.m18089b(name, "vector")) {
                                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                                    Resources.Theme theme = context.getTheme();
                                    c6119f = new C6130q();
                                    c6119f.inflate(resources, xml, attributeSetAsAttributeSet, theme);
                                } else if (AbstractC16544l.m18089b(name, "animated-vector")) {
                                    AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml);
                                    Resources.Theme theme2 = context.getTheme();
                                    c6119f = new C6119f(context);
                                    c6119f.inflate(resources, xml, attributeSetAsAttributeSet2, theme2);
                                } else {
                                    Resources.Theme theme3 = context.getTheme();
                                    ThreadLocal threadLocal = AbstractC18619k.f59299a;
                                    drawable = resources.getDrawable(iIntValue, theme3);
                                    if (drawable == null) {
                                        throw new IllegalStateException(AbstractC10763a.m11048f(iIntValue, "Invalid resource ID: ").toString());
                                    }
                                }
                                drawable = c6119f;
                            } else {
                                Resources.Theme theme4 = context.getTheme();
                                ThreadLocal threadLocal2 = AbstractC18619k.f59299a;
                                drawable = resources.getDrawable(iIntValue, theme4);
                                if (drawable == null) {
                                    throw new IllegalStateException(AbstractC10763a.m11048f(iIntValue, "Invalid resource ID: ").toString());
                                }
                            }
                        }
                        if (!(drawable instanceof VectorDrawable) && !(drawable instanceof C6130q)) {
                            z6 = false;
                        }
                        if (z6) {
                            drawable = new BitmapDrawable(context.getResources(), AbstractC8020X.m8356f(drawable, c20835m.f66239b, c20835m.f66241d, c20835m.f66242e, c20835m.f66243f));
                        }
                        return new C18629d(drawable, z6, EnumC17488e.f55953o0);
                    }
                }
                throw new IllegalStateException("Invalid android.resource URI: " + uri);
        }
    }
}
