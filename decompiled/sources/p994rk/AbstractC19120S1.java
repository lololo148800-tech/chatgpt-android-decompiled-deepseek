package p994rk;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import fk.EnumC13687h;
import hk.C14525c;
import java.util.LinkedList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16556x;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p1113xn.AbstractC21329w;
import p1120y4.C21382i;
import p310M9.C5311e;
import p523V9.AbstractC8040Z5;
import p931ok.C18233n;

/* JADX INFO: renamed from: rk.S1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19120S1 {
    /* JADX INFO: renamed from: a */
    public static final String m20301a(String str, UiComponentConfig.RemoteImageComponentStyle remoteImageComponentStyle) {
        Integer originalStrokeColorValue;
        Integer originalBackgroundColorValue;
        Integer originalHighlightColorValue;
        Integer originalFillColorValue;
        Integer originalStrokeColorValue2;
        Integer originalBackgroundColorValue2;
        Integer originalHighlightColorValue2;
        Integer originalFillColorValue2;
        if (remoteImageComponentStyle != null && (originalFillColorValue2 = remoteImageComponentStyle.getOriginalFillColorValue()) != null) {
            int iIntValue = originalFillColorValue2.intValue();
            Integer newFillColorValue = remoteImageComponentStyle.getNewFillColorValue();
            if (newFillColorValue != null) {
                C21382i.m21763d(newFillColorValue.intValue());
                str = AbstractC21329w.m21731r(str, C21382i.m21763d(iIntValue), "{{ fill_color }}");
            }
        }
        if (remoteImageComponentStyle != null && (originalHighlightColorValue2 = remoteImageComponentStyle.getOriginalHighlightColorValue()) != null) {
            int iIntValue2 = originalHighlightColorValue2.intValue();
            Integer newHighlightColorValue = remoteImageComponentStyle.getNewHighlightColorValue();
            if (newHighlightColorValue != null) {
                C21382i.m21763d(newHighlightColorValue.intValue());
                str = AbstractC21329w.m21731r(str, C21382i.m21763d(iIntValue2), "{{ highlight_color }}");
            }
        }
        if (remoteImageComponentStyle != null && (originalBackgroundColorValue2 = remoteImageComponentStyle.getOriginalBackgroundColorValue()) != null) {
            int iIntValue3 = originalBackgroundColorValue2.intValue();
            Integer newBackgroundColorValue = remoteImageComponentStyle.getNewBackgroundColorValue();
            if (newBackgroundColorValue != null) {
                C21382i.m21763d(newBackgroundColorValue.intValue());
                str = AbstractC21329w.m21731r(str, C21382i.m21763d(iIntValue3), "{{ background_color }}");
            }
        }
        if (remoteImageComponentStyle != null && (originalStrokeColorValue2 = remoteImageComponentStyle.getOriginalStrokeColorValue()) != null) {
            int iIntValue4 = originalStrokeColorValue2.intValue();
            Integer newStrokeColorValue = remoteImageComponentStyle.getNewStrokeColorValue();
            if (newStrokeColorValue != null) {
                C21382i.m21763d(newStrokeColorValue.intValue());
                str = AbstractC21329w.m21731r(str, C21382i.m21763d(iIntValue4), "{{ stroke_color }}");
            }
        }
        if (remoteImageComponentStyle != null && (originalFillColorValue = remoteImageComponentStyle.getOriginalFillColorValue()) != null) {
            int iIntValue5 = originalFillColorValue.intValue();
            Integer newFillColorValue2 = remoteImageComponentStyle.getNewFillColorValue();
            if (newFillColorValue2 != null) {
                str = m20303c(str, "{{ fill_color }}", C21382i.m21763d(newFillColorValue2.intValue()), C21382i.m21763d(iIntValue5));
            }
        }
        if (remoteImageComponentStyle != null && (originalHighlightColorValue = remoteImageComponentStyle.getOriginalHighlightColorValue()) != null) {
            int iIntValue6 = originalHighlightColorValue.intValue();
            Integer newHighlightColorValue2 = remoteImageComponentStyle.getNewHighlightColorValue();
            if (newHighlightColorValue2 != null) {
                str = m20303c(str, "{{ highlight_color }}", C21382i.m21763d(newHighlightColorValue2.intValue()), C21382i.m21763d(iIntValue6));
            }
        }
        if (remoteImageComponentStyle != null && (originalBackgroundColorValue = remoteImageComponentStyle.getOriginalBackgroundColorValue()) != null) {
            int iIntValue7 = originalBackgroundColorValue.intValue();
            Integer newBackgroundColorValue2 = remoteImageComponentStyle.getNewBackgroundColorValue();
            if (newBackgroundColorValue2 != null) {
                str = m20303c(str, "{{ background_color }}", C21382i.m21763d(newBackgroundColorValue2.intValue()), C21382i.m21763d(iIntValue7));
            }
        }
        if (remoteImageComponentStyle == null || (originalStrokeColorValue = remoteImageComponentStyle.getOriginalStrokeColorValue()) == null) {
            return str;
        }
        int iIntValue8 = originalStrokeColorValue.intValue();
        Integer newStrokeColorValue2 = remoteImageComponentStyle.getNewStrokeColorValue();
        return newStrokeColorValue2 != null ? m20303c(str, "{{ stroke_color }}", C21382i.m21763d(newStrokeColorValue2.intValue()), C21382i.m21763d(iIntValue8)) : str;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
    /* JADX INFO: renamed from: b */
    public static final View m20302b(C19094J1 c19094j1, C5311e c5311e) {
        View root;
        C14525c c14525cM16033a;
        Integer numM8410f;
        C14525c c14525cM16033a2;
        AbstractC16544l.m18094g(c19094j1, "<this>");
        UiComponentConfig.RemoteImage remoteImage = c19094j1.f60779Y;
        UiComponentConfig.RemoteImage.Attributes attributes = remoteImage.getAttributes();
        String localAssetName = attributes != null ? attributes.getLocalAssetName() : null;
        UiComponentConfig.RemoteImage.ContentType localAssetContentType = attributes != null ? attributes.getLocalAssetContentType() : null;
        LinkedList linkedList = (LinkedList) c5311e.f17486p0;
        LayoutInflater layoutInflater = (LayoutInflater) c5311e.f17485o0;
        if (localAssetName == null || localAssetContentType == null) {
            root = null;
        } else {
            C16556x c16556x = new C16556x();
            int[] iArr = AbstractC19100L1.f60791a;
            int i10 = iArr[localAssetContentType.ordinal()];
            Context context = (Context) c5311e.f17484Z;
            if (i10 == 1) {
                numM8410f = AbstractC8040Z5.m8410f(context, localAssetName, EnumC13687h.f43184o0);
            } else if (i10 == 2) {
                numM8410f = AbstractC8040Z5.m8410f(context, localAssetName, EnumC13687h.f43183Z);
            } else {
                if (i10 != 3) {
                    throw new C0644w();
                }
                numM8410f = AbstractC8040Z5.m8410f(context, localAssetName, EnumC13687h.f43184o0);
                if (numM8410f != null) {
                    c16556x.f51285Y = true;
                } else {
                    numM8410f = AbstractC8040Z5.m8410f(context, localAssetName, EnumC13687h.f43183Z);
                }
            }
            if (numM8410f != null) {
                int iIntValue = numM8410f.intValue();
                int i11 = iArr[localAssetContentType.ordinal()];
                if (i11 == 1) {
                    c14525cM16033a2 = C14525c.m16033a(layoutInflater);
                    linkedList.add(new C19103M1(c14525cM16033a2, c19094j1));
                    ((ThemeableLottieAnimationView) c14525cM16033a2.f45778c).setAnimation(iIntValue);
                } else if (i11 == 2) {
                    c14525cM16033a2 = C14525c.m16035c(layoutInflater);
                    linkedList.add(new C19106N1(c14525cM16033a2, c19094j1, iIntValue));
                } else {
                    if (i11 != 3) {
                        throw new C0644w();
                    }
                    c14525cM16033a2 = C14525c.m16035c(layoutInflater);
                    linkedList.add(new C19109O1(c14525cM16033a2, c19094j1, c16556x, context, iIntValue));
                }
                root = c14525cM16033a2.getRoot();
            } else {
                root = null;
            }
        }
        if (root != null) {
            return root;
        }
        UiComponentConfig.RemoteImage.Attributes attributes2 = remoteImage.getAttributes();
        UiComponentConfig.RemoteImage.ContentType contentType = attributes2 != null ? attributes2.getContentType() : null;
        int i12 = contentType == null ? -1 : AbstractC19100L1.f60791a[contentType.ordinal()];
        if (i12 == 1) {
            c14525cM16033a = C14525c.m16033a(layoutInflater);
            linkedList.add(new C19115Q1(c14525cM16033a, c19094j1));
            String url = attributes2.getUrl();
            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) c14525cM16033a.f45778c;
            AbstractC16544l.m18094g(url, "url");
            AbstractC0575H.m1156D(themeableLottieAnimationView.f40896G0, null, null, new C18233n(themeableLottieAnimationView, url, null), 3);
        } else if (i12 != 3) {
            c14525cM16033a = C14525c.m16035c(layoutInflater);
            linkedList.add(new C19117R1(c14525cM16033a, c19094j1, attributes2));
        } else {
            c14525cM16033a = C14525c.m16035c(layoutInflater);
            linkedList.add(new C19112P1(c14525cM16033a, c19094j1, attributes2));
        }
        View root2 = c14525cM16033a.getRoot();
        AbstractC16544l.m18093f(root2, "getRoot(...)");
        return root2;
    }

    /* JADX INFO: renamed from: c */
    public static final String m20303c(String str, String str2, String str3, String str4) {
        try {
            Color.parseColor(str3);
            return AbstractC21329w.m21731r(str, str2, str3);
        } catch (IllegalArgumentException unused) {
            return AbstractC21329w.m21731r(str, str2, str4);
        }
    }
}
