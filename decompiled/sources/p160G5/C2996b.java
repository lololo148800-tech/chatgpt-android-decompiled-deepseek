package p160G5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Bitmap;
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
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.MediaStreamTrack;
import org.xmlpull.v1.XmlPullParserException;
import p011A9.C0415f;
import p026Ao.AbstractC0668b;
import p026Ao.AbstractC0682p;
import p026Ao.C0654C;
import p033B5.AbstractC0833q;
import p033B5.C0816A;
import p051Bo.AbstractC1456b;
import p051Bo.C1460f;
import p1061vb.C20513d;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p111E5.C2317a;
import p111E5.C2323g;
import p111E5.C2332p;
import p111E5.C2334r;
import p111E5.C2335s;
import p111E5.EnumC2324h;
import p138F8.vJO.vRJidSveZHcTw;
import p353O4.C6119f;
import p353O4.C6130q;
import p374P5.AbstractC6356i;
import p374P5.C6361n;
import p397Q5.C6572a;
import p397Q5.C6579h;
import p397Q5.EnumC6575d;
import p397Q5.InterfaceC6574c;
import p496U5.AbstractC7565g;
import p496U5.AbstractC7568j;
import p571X9.AbstractC9106B3;
import p571X9.AbstractC9143H4;
import p594Y9.AbstractC9759L;
import p909nm.AbstractC17680n;
import p955q2.AbstractC18619k;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: G5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2996b implements InterfaceC3001g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9017a;

    /* JADX INFO: renamed from: b */
    public final C0816A f9018b;

    /* JADX INFO: renamed from: c */
    public final C6361n f9019c;

    public /* synthetic */ C2996b(C0816A c0816a, C6361n c6361n, int i10) {
        this.f9017a = i10;
        this.f9018b = c0816a;
        this.f9019c = c6361n;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
    @Override // p160G5.InterfaceC3001g
    /* JADX INFO: renamed from: a */
    public final Object mo3829a(AbstractC19687c abstractC19687c) throws XmlPullParserException, IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        List listM1894g;
        int size;
        Integer numM21736w;
        Drawable drawable;
        Drawable c6119f;
        Bundle bundle = null;
        String mimeTypeFromExtension = null;
        String mimeTypeFromExtension2 = null;
        bundle = null;
        C6361n c6361n = this.f9019c;
        C0816A c0816a = this.f9018b;
        switch (this.f9017a) {
            case 0:
                String strM19349Y = AbstractC17680n.m19349Y(AbstractC17680n.m19336L(AbstractC0833q.m1894g(c0816a), 1), Separators.SLASH, null, null, 0, null, null, 62);
                return new C3003i(new C2335s(AbstractC0668b.m1403c(AbstractC0668b.m1410j(c6361n.f20697a.getAssets().open(strM19349Y))), c6361n.f20702f, new C2317a(strM19349Y)), AbstractC9759L.m10363b(strM19349Y), EnumC2324h.f7226o0);
            case 1:
                Uri uri = Uri.parse(c0816a.f2276a);
                ContentResolver contentResolver = c6361n.f20697a.getContentResolver();
                String str = vRJidSveZHcTw.INpRgs;
                String str2 = c0816a.f2279d;
                if (AbstractC16544l.m18089b(str2, str) && AbstractC16544l.m18089b(AbstractC17680n.m19353c0(AbstractC0833q.m1894g(c0816a)), "display_photo")) {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        throw new IllegalStateException(("Unable to find a contact photo associated with '" + uri + "'.").toString());
                    }
                } else if (Build.VERSION.SDK_INT >= 29 && AbstractC16544l.m18089b(str2, "media") && (size = (listM1894g = AbstractC0833q.m1894g(c0816a)).size()) >= 3 && AbstractC16544l.m18089b(listM1894g.get(size - 3), MediaStreamTrack.AUDIO_TRACK_KIND) && AbstractC16544l.m18089b(listM1894g.get(size - 2), "albums")) {
                    C6579h c6579h = c6361n.f20698b;
                    InterfaceC6574c interfaceC6574c = c6579h.f21265a;
                    C6572a c6572a = interfaceC6574c instanceof C6572a ? (C6572a) interfaceC6574c : null;
                    if (c6572a != null) {
                        InterfaceC6574c interfaceC6574c2 = c6579h.f21266b;
                        C6572a c6572a2 = interfaceC6574c2 instanceof C6572a ? (C6572a) interfaceC6574c2 : null;
                        if (c6572a2 != null) {
                            bundle = new Bundle(1);
                            bundle.putParcelable("android.content.extra.SIZE", new Point(c6572a.f21256a, c6572a2.f21256a));
                        }
                    }
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uri + "'.").toString());
                    }
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        throw new IllegalStateException(("Unable to open '" + uri + "'.").toString());
                    }
                }
                return new C3003i(new C2335s(AbstractC0668b.m1403c(AbstractC0668b.m1410j(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), c6361n.f20702f, new C2323g(assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri), EnumC2324h.f7226o0);
            case 2:
                String str3 = C0654C.f1910Z;
                String strM1893f = AbstractC0833q.m1893f(c0816a);
                if (strM1893f == null) {
                    throw new IllegalStateException("filePath == null");
                }
                C0654C c0654cM21169n = C20513d.m21169n(strM1893f, false);
                C2332p c2332pM1026b = C0415f.m1026b(c0654cM21169n, c6361n.f20702f, null, null, 28);
                String strM21703k0 = AbstractC21322p.m21703k0('.', c0654cM21169n.m1318b(), "");
                if (!AbstractC21322p.m21681O(strM21703k0)) {
                    String lowerCase = strM21703k0.toLowerCase(Locale.ROOT);
                    AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
                    String str4 = (String) AbstractC7565g.f23967a.get(lowerCase);
                    mimeTypeFromExtension2 = str4 == null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase) : str4;
                }
                return new C3003i(c2332pM1026b, mimeTypeFromExtension2, EnumC2324h.f7226o0);
            case 3:
                String str5 = c0816a.f2280e;
                if (str5 == null) {
                    str5 = "";
                }
                int iM21678L = AbstractC21322p.m21678L(str5, '!', 0, false, 6);
                if (iM21678L == -1) {
                    throw new IllegalStateException(("Invalid jar:file URI: " + c0816a).toString());
                }
                String str6 = C0654C.f1910Z;
                String strSubstring = str5.substring(0, iM21678L);
                AbstractC16544l.m18093f(strSubstring, "substring(...)");
                C0654C c0654cM21169n2 = C20513d.m21169n(strSubstring, false);
                String strSubstring2 = str5.substring(iM21678L + 1, str5.length());
                AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                C0654C c0654cM21169n3 = C20513d.m21169n(strSubstring2, false);
                AbstractC0682p abstractC0682p = c6361n.f20702f;
                AbstractC16544l.m18094g(abstractC0682p, "<this>");
                C2332p c2332pM1026b2 = C0415f.m1026b(c0654cM21169n3, AbstractC1456b.m2065e(c0654cM21169n2, abstractC0682p, C1460f.f3839o0), null, null, 28);
                String strM21703k1 = AbstractC21322p.m21703k0('.', c0654cM21169n3.m1318b(), "");
                if (!AbstractC21322p.m21681O(strM21703k1)) {
                    String lowerCase2 = strM21703k1.toLowerCase(Locale.ROOT);
                    AbstractC16544l.m18093f(lowerCase2, "toLowerCase(...)");
                    String str7 = (String) AbstractC7565g.f23967a.get(lowerCase2);
                    mimeTypeFromExtension = str7 == null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase2) : str7;
                }
                return new C3003i(c2332pM1026b2, mimeTypeFromExtension, EnumC2324h.f7226o0);
            default:
                String str8 = c0816a.f2279d;
                if (str8 != null) {
                    String str9 = AbstractC21322p.m21681O(str8) ? null : str8;
                    if (str9 != null) {
                        String str10 = (String) AbstractC17680n.m19353c0(AbstractC0833q.m1894g(c0816a));
                        if (str10 == null || (numM21736w = AbstractC21329w.m21736w(str10)) == null) {
                            throw new IllegalStateException("Invalid android.resource URI: " + c0816a);
                        }
                        int iIntValue = numM21736w.intValue();
                        Context context = c6361n.f20697a;
                        Resources resources = str9.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str9);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        String strM10363b = AbstractC9759L.m10363b(typedValue.string.toString());
                        if (!AbstractC16544l.m18089b(strM10363b, "text/xml")) {
                            return new C3003i(new C2335s(AbstractC0668b.m1403c(AbstractC0668b.m1410j(resources.openRawResource(iIntValue, new TypedValue()))), c6361n.f20702f, new C2334r(str9, iIntValue)), strM10363b, EnumC2324h.f7226o0);
                        }
                        if (str9.equals(context.getPackageName())) {
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
                        Bitmap.Config[] configArr = AbstractC7568j.f23971a;
                        boolean z6 = (drawable instanceof VectorDrawable) || (drawable instanceof C6130q);
                        if (z6) {
                            drawable = new BitmapDrawable(context.getResources(), AbstractC9143H4.m9687a(drawable, (Bitmap.Config) AbstractC0833q.m1892e(c6361n, AbstractC6356i.f20686c), c6361n.f20698b, c6361n.f20699c, c6361n.f20700d == EnumC6575d.f21259Z));
                        }
                        return new C3002h(AbstractC0833q.m1890c(drawable), z6, EnumC2324h.f7226o0);
                    }
                }
                throw new IllegalStateException("Invalid android.resource URI: " + c0816a);
        }
    }
}
