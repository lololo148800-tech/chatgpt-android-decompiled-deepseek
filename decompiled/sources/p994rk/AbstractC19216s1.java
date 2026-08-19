package p994rk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import hk.C14525c;
import java.util.LinkedList;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p1110xk.AbstractC21284g;
import p310M9.C5311e;
import p396Q4.InterfaceC6571a;
import p523V9.AbstractC8040Z5;
import p730ek.C13438c;

/* JADX INFO: renamed from: rk.s1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19216s1 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC6571a m20324a(C19134X0 c19134x0, C5311e c5311e, int i10, int i11, String[] strArr, String[] strArr2) {
        AbstractC16544l.m18094g(c19134x0, "<this>");
        LocalImageComponentStyle styles = c19134x0.f60836Y.getStyles();
        LinkedList linkedList = (LinkedList) c5311e.f17486p0;
        LayoutInflater layoutInflater = (LayoutInflater) c5311e.f17485o0;
        if (styles != null) {
            C14525c c14525cM16033a = C14525c.m16033a(layoutInflater);
            ((ThemeableLottieAnimationView) c14525cM16033a.f45778c).setAnimation(i10);
            linkedList.add(new C19140Z0(c14525cM16033a, c19134x0, strArr, strArr2));
            return c14525cM16033a;
        }
        int dimension = (int) ((Context) c5311e.f17484Z).getResources().getDimension(R.dimen.pi2_small_default_option_local_image_height);
        C14525c c14525cM16035c = C14525c.m16035c(layoutInflater);
        ((ImageView) c14525cM16035c.f45778c).setImageResource(i11);
        linkedList.add(new C19144a1(c14525cM16035c, dimension, 0));
        return c14525cM16035c;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:101:0x05b0 A[ORIG_RETURN, RETURN] */
    /* JADX INFO: renamed from: b */
    public static final View m20325b(C19134X0 c19134x0, C5311e c5311e) {
        InterfaceC6571a interfaceC6571aM20324a;
        C14525c c14525cM16035c;
        C14525c c14525cM16033a;
        C14525c c14525cM16035c2;
        C14525c c14525cM16035c3;
        C14525c c14525cM16035c4;
        C14525c c14525cM16035c5;
        C14525c c14525cM16035c6;
        C14525c c14525cM16035c7;
        C14525c c14525cM16035c8;
        C14525c c14525cM16033a2;
        AbstractC16544l.m18094g(c19134x0, "<this>");
        Context context = (Context) c5311e.f17484Z;
        int dimension = (int) context.getResources().getDimension(R.dimen.pi2_default_local_image_height);
        int dimension2 = (int) context.getResources().getDimension(R.dimen.pi2_small_default_local_image_height);
        UiComponentConfig.LocalImage localImage = c19134x0.f60836Y;
        UiComponentConfig.LocalImage.Attributes attributes = localImage.getAttributes();
        UiComponentConfig.LocalImage.Image imageKey = attributes != null ? attributes.getImageKey() : null;
        int i10 = imageKey == null ? -1 : AbstractC19137Y0.f60840a[imageKey.ordinal()];
        LinkedList linkedList = (LinkedList) c5311e.f17486p0;
        LayoutInflater layoutInflater = (LayoutInflater) c5311e.f17485o0;
        switch (i10) {
            case -1:
                interfaceC6571aM20324a = null;
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 0:
            default:
                throw new C0644w();
            case 1:
                if (localImage.getStyles() != null) {
                    c14525cM16033a = C14525c.m16033a(layoutInflater);
                    ((ThemeableLottieAnimationView) c14525cM16033a.f45778c).setAnimation(R.raw.pi2_inquiry_start_hero);
                    linkedList.add(new C19148b1(c14525cM16033a, c19134x0));
                    interfaceC6571aM20324a = c14525cM16033a;
                } else {
                    c14525cM16035c = C14525c.m16035c(layoutInflater);
                    ((ImageView) c14525cM16035c.f45778c).setImageResource(R.drawable.pi2_inquiry_start_hero);
                    linkedList.add(new C19144a1(c14525cM16035c, dimension, 5));
                }
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 2:
                if (localImage.getStyles() != null) {
                    c14525cM16033a = C14525c.m16033a(layoutInflater);
                    ((ThemeableLottieAnimationView) c14525cM16033a.f45778c).setAnimation(R.raw.pi2_document_start_hero);
                    linkedList.add(new C19204p1(c14525cM16033a, c19134x0));
                    interfaceC6571aM20324a = c14525cM16033a;
                } else {
                    c14525cM16035c2 = C14525c.m16035c(layoutInflater);
                    ((ImageView) c14525cM16035c2.f45778c).setImageResource(R.drawable.pi2_document_start_hero);
                    linkedList.add(new C19144a1(c14525cM16035c2, dimension, 6));
                }
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 3:
                C14525c c14525cM16033a3 = C14525c.m16033a(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) c14525cM16033a3.f45778c;
                themeableLottieAnimationView.setAnimation(R.raw.pi2_inquiry_successanimation);
                linkedList.add(new C19172h1(c14525cM16033a3, 9));
                themeableLottieAnimationView.m13141c(new C13438c(c14525cM16033a3, 2));
                interfaceC6571aM20324a = c14525cM16033a3;
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 4:
                if (localImage.getStyles() != null) {
                    c14525cM16033a = C14525c.m16033a(layoutInflater);
                    ((ThemeableLottieAnimationView) c14525cM16033a.f45778c).setAnimation(R.raw.pi2_inquiry_failed);
                    linkedList.add(new C19208q1(c14525cM16033a, c19134x0));
                    interfaceC6571aM20324a = c14525cM16033a;
                } else {
                    c14525cM16035c3 = C14525c.m16035c(layoutInflater);
                    ((ImageView) c14525cM16035c3.f45778c).setImageResource(R.drawable.pi2_inquiry_failed);
                    linkedList.add(new C19144a1(c14525cM16035c3, dimension2, 7));
                }
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 5:
                if (localImage.getStyles() != null) {
                    c14525cM16033a = C14525c.m16033a(layoutInflater);
                    ((ThemeableLottieAnimationView) c14525cM16033a.f45778c).setAnimation(R.raw.pi2_id_front_fail);
                    linkedList.add(new C19212r1(c14525cM16033a, c19134x0));
                    interfaceC6571aM20324a = c14525cM16033a;
                } else {
                    c14525cM16035c4 = C14525c.m16035c(layoutInflater);
                    ((ImageView) c14525cM16035c4.f45778c).setImageResource(R.drawable.pi2_id_front_fail);
                    linkedList.add(new C19144a1(c14525cM16035c4, dimension2, 8));
                }
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 6:
                if (localImage.getStyles() != null) {
                    c14525cM16033a = C14525c.m16033a(layoutInflater);
                    ((ThemeableLottieAnimationView) c14525cM16033a.f45778c).setAnimation(R.raw.pi2_id_back_fail);
                    linkedList.add(new C19152c1(c14525cM16033a, c19134x0));
                    interfaceC6571aM20324a = c14525cM16033a;
                } else {
                    c14525cM16035c5 = C14525c.m16035c(layoutInflater);
                    ((ImageView) c14525cM16035c5.f45778c).setImageResource(R.drawable.pi2_id_back_fail);
                    linkedList.add(new C19144a1(c14525cM16035c5, dimension2, 1));
                }
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 7:
                if (localImage.getStyles() != null) {
                    c14525cM16033a = C14525c.m16033a(layoutInflater);
                    ((ThemeableLottieAnimationView) c14525cM16033a.f45778c).setAnimation(R.raw.pi2_selfie_fail);
                    linkedList.add(new C19156d1(c14525cM16033a, c19134x0));
                    interfaceC6571aM20324a = c14525cM16033a;
                } else {
                    c14525cM16035c6 = C14525c.m16035c(layoutInflater);
                    ((ImageView) c14525cM16035c6.f45778c).setImageResource(R.drawable.pi2_selfie_fail);
                    linkedList.add(new C19144a1(c14525cM16035c6, dimension2, 2));
                }
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 8:
                if (localImage.getStyles() != null) {
                    c14525cM16033a = C14525c.m16033a(layoutInflater);
                    ((ThemeableLottieAnimationView) c14525cM16033a.f45778c).setAnimation(R.raw.pi2_document_failed);
                    linkedList.add(new C19160e1(c14525cM16033a, c19134x0));
                    interfaceC6571aM20324a = c14525cM16033a;
                } else {
                    c14525cM16035c7 = C14525c.m16035c(layoutInflater);
                    ((ImageView) c14525cM16035c7.f45778c).setImageResource(R.drawable.pi2_document_failed);
                    linkedList.add(new C19144a1(c14525cM16035c7, dimension, 3));
                }
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 9:
                if (localImage.getStyles() != null) {
                    c14525cM16033a = C14525c.m16033a(layoutInflater);
                    ((ThemeableLottieAnimationView) c14525cM16033a.f45778c).setAnimation(R.raw.pi2_passport_nfc_start_hero);
                    linkedList.add(new C19164f1(c14525cM16033a, c19134x0));
                    interfaceC6571aM20324a = c14525cM16033a;
                } else {
                    c14525cM16035c8 = C14525c.m16035c(layoutInflater);
                    ((ImageView) c14525cM16035c8.f45778c).setImageResource(R.drawable.pi2_passport_nfc_start_hero);
                    linkedList.add(new C19144a1(c14525cM16035c8, dimension, 4));
                }
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 10:
                c14525cM16033a = C14525c.m16033a(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView2 = (ThemeableLottieAnimationView) c14525cM16033a.f45778c;
                themeableLottieAnimationView2.setAnimation(R.raw.pi2_passport_nfc_scan_hero);
                themeableLottieAnimationView2.m13144f();
                if (localImage.getStyles() != null) {
                    linkedList.add(new C19168g1(c14525cM16033a, c19134x0));
                } else {
                    AbstractC21284g.m21628d(themeableLottieAnimationView2, Integer.valueOf(AbstractC8040Z5.m8408d(context, R.attr.colorPrimaryVariant)), Integer.valueOf(AbstractC8040Z5.m8408d(context, R.attr.colorSecondary)), null, new String[]{"#190052"}, new String[]{"#F1EBFF", "#8552FF"}, new String[]{"#FFFFFF"});
                }
                linkedList.add(new C19172h1(c14525cM16033a, 0));
                interfaceC6571aM20324a = c14525cM16033a;
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 11:
                c14525cM16033a = C14525c.m16033a(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView3 = (ThemeableLottieAnimationView) c14525cM16033a.f45778c;
                themeableLottieAnimationView3.setAnimation(R.raw.pi2_passport_nfc_scan_ready_hero);
                linkedList.add(new C19172h1(c14525cM16033a, 1));
                if (localImage.getStyles() != null) {
                    linkedList.add(new C19176i1(c14525cM16033a, c19134x0));
                } else {
                    AbstractC21284g.m21628d(themeableLottieAnimationView3, Integer.valueOf(AbstractC8040Z5.m8408d(context, R.attr.colorPrimaryVariant)), Integer.valueOf(AbstractC8040Z5.m8408d(context, R.attr.colorSecondary)), null, new String[]{"#02214F", "#190051"}, new String[]{"#E5E5EA"}, new String[0]);
                }
                interfaceC6571aM20324a = c14525cM16033a;
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 12:
                c14525cM16033a = C14525c.m16033a(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView4 = (ThemeableLottieAnimationView) c14525cM16033a.f45778c;
                themeableLottieAnimationView4.setAnimation(R.raw.pi2_passport_nfc_check);
                if (localImage.getStyles() != null) {
                    linkedList.add(new C19180j1(c14525cM16033a, c19134x0));
                } else {
                    AbstractC21284g.m21628d(themeableLottieAnimationView4, Integer.valueOf(AbstractC8040Z5.m8408d(context, R.attr.colorPrimaryVariant)), null, null, new String[]{"#280087"}, new String[0], new String[0]);
                }
                linkedList.add(new C19172h1(c14525cM16033a, 2));
                interfaceC6571aM20324a = c14525cM16033a;
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 13:
                c14525cM16033a = C14525c.m16033a(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView5 = (ThemeableLottieAnimationView) c14525cM16033a.f45778c;
                themeableLottieAnimationView5.setAnimation(R.raw.pi2_government_id_nfc_scan_back_closed);
                themeableLottieAnimationView5.m13144f();
                if (localImage.getStyles() != null) {
                    linkedList.add(new C19184k1(c14525cM16033a, c19134x0));
                } else {
                    AbstractC21284g.m21628d(themeableLottieAnimationView5, Integer.valueOf(AbstractC8040Z5.m8408d(context, R.attr.colorPrimaryVariant)), Integer.valueOf(AbstractC8040Z5.m8408d(context, R.attr.colorSecondary)), null, new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
                }
                linkedList.add(new C19172h1(c14525cM16033a, 3));
                interfaceC6571aM20324a = c14525cM16033a;
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 14:
                c14525cM16033a = C14525c.m16033a(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView6 = (ThemeableLottieAnimationView) c14525cM16033a.f45778c;
                themeableLottieAnimationView6.setAnimation(R.raw.pi2_government_id_nfc_scan_front_closed);
                themeableLottieAnimationView6.m13144f();
                if (localImage.getStyles() != null) {
                    linkedList.add(new C19188l1(c14525cM16033a, c19134x0));
                } else {
                    AbstractC21284g.m21628d(themeableLottieAnimationView6, Integer.valueOf(AbstractC8040Z5.m8408d(context, R.attr.colorPrimaryVariant)), Integer.valueOf(AbstractC8040Z5.m8408d(context, R.attr.colorSecondary)), null, new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
                }
                linkedList.add(new C19172h1(c14525cM16033a, 4));
                interfaceC6571aM20324a = c14525cM16033a;
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 15:
                c14525cM16033a = C14525c.m16033a(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView7 = (ThemeableLottieAnimationView) c14525cM16033a.f45778c;
                themeableLottieAnimationView7.setAnimation(R.raw.pi2_government_id_nfc_scan_photo_page);
                themeableLottieAnimationView7.m13144f();
                if (localImage.getStyles() != null) {
                    linkedList.add(new C19192m1(c14525cM16033a, c19134x0));
                } else {
                    AbstractC21284g.m21628d(themeableLottieAnimationView7, Integer.valueOf(AbstractC8040Z5.m8408d(context, R.attr.colorPrimaryVariant)), Integer.valueOf(AbstractC8040Z5.m8408d(context, R.attr.colorSecondary)), null, new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
                }
                linkedList.add(new C19172h1(c14525cM16033a, 5));
                interfaceC6571aM20324a = c14525cM16033a;
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 16:
                c14525cM16033a = C14525c.m16033a(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView8 = (ThemeableLottieAnimationView) c14525cM16033a.f45778c;
                themeableLottieAnimationView8.setAnimation(R.raw.pi2_government_id_nfc_scan_id_card);
                themeableLottieAnimationView8.m13144f();
                if (localImage.getStyles() != null) {
                    linkedList.add(new C19196n1(c14525cM16033a, c19134x0));
                } else {
                    AbstractC21284g.m21628d(themeableLottieAnimationView8, Integer.valueOf(AbstractC8040Z5.m8408d(context, R.attr.colorPrimaryVariant)), Integer.valueOf(AbstractC8040Z5.m8408d(context, R.attr.colorSecondary)), null, new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
                }
                linkedList.add(new C19172h1(c14525cM16033a, 6));
                interfaceC6571aM20324a = c14525cM16033a;
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 17:
                c14525cM16033a = C14525c.m16033a(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView9 = (ThemeableLottieAnimationView) c14525cM16033a.f45778c;
                themeableLottieAnimationView9.setAnimation(R.raw.pi2_government_id_nfc_scan_back_then_front);
                themeableLottieAnimationView9.m13144f();
                if (localImage.getStyles() != null) {
                    linkedList.add(new C19200o1(c14525cM16033a, c19134x0));
                } else {
                    AbstractC21284g.m21628d(themeableLottieAnimationView9, Integer.valueOf(AbstractC8040Z5.m8408d(context, R.attr.colorPrimaryVariant)), Integer.valueOf(AbstractC8040Z5.m8408d(context, R.attr.colorSecondary)), null, new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
                }
                linkedList.add(new C19172h1(c14525cM16033a, 7));
                interfaceC6571aM20324a = c14525cM16033a;
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 18:
                c14525cM16033a2 = C14525c.m16033a(layoutInflater);
                ThemeableLottieAnimationView themeableLottieAnimationView10 = (ThemeableLottieAnimationView) c14525cM16033a2.f45778c;
                themeableLottieAnimationView10.setImageResource(R.drawable.pi2_create_persona_cta_card_icon);
                if (localImage.getStyles() != null) {
                    AbstractC21284g.m21625a(themeableLottieAnimationView10, localImage.getStyles(), new String[0], new String[0], new String[0]);
                } else {
                    linkedList.add(new C19172h1(c14525cM16033a2, 8));
                }
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 19:
                interfaceC6571aM20324a = m20324a(c19134x0, c5311e, R.raw.pi2_option_check_icon, R.drawable.p2_option_check_icon, new String[0], new String[0]);
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 20:
                interfaceC6571aM20324a = m20324a(c19134x0, c5311e, R.raw.pi2_option_flag_icon, R.drawable.p2_option_flag_icon, new String[]{"#FFFFFF"}, new String[]{"#000000"});
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 21:
                interfaceC6571aM20324a = m20324a(c19134x0, c5311e, R.raw.pi2_option_globe_icon, R.drawable.p2_option_globe_icon, new String[]{"#FFFFFF"}, new String[]{"#000000"});
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 22:
                interfaceC6571aM20324a = m20324a(c19134x0, c5311e, R.raw.pi2_option_home_icon, R.drawable.p2_option_home_icon, new String[]{"#FFFFFF"}, new String[]{"#000000"});
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 23:
                interfaceC6571aM20324a = m20324a(c19134x0, c5311e, R.raw.pi2_option_id_document_icon, R.drawable.p2_option_id_document_icon, new String[]{"#FFFFFF"}, new String[]{"#000000"});
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 24:
                interfaceC6571aM20324a = m20324a(c19134x0, c5311e, R.raw.pi2_option_id_icon, R.drawable.p2_option_id_icon, new String[]{"#FFFFFF"}, new String[]{"#000000"});
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 25:
                interfaceC6571aM20324a = m20324a(c19134x0, c5311e, R.raw.pi2_option_phone_icon, R.drawable.p2_option_phone_icon, new String[]{"#FFFFFF"}, new String[]{"#000000"});
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
            case 26:
                interfaceC6571aM20324a = m20324a(c19134x0, c5311e, R.raw.pi2_option_user_icon, R.drawable.p2_option_user_icon, new String[]{"#FFFFFF"}, new String[]{"#000000"});
                if (interfaceC6571aM20324a != null) {
                    interfaceC6571aM20324a = c14525cM16035c;
                    interfaceC6571aM20324a = c14525cM16035c2;
                    interfaceC6571aM20324a = c14525cM16035c3;
                    interfaceC6571aM20324a = c14525cM16035c4;
                    interfaceC6571aM20324a = c14525cM16035c5;
                    interfaceC6571aM20324a = c14525cM16035c6;
                    interfaceC6571aM20324a = c14525cM16035c7;
                    interfaceC6571aM20324a = c14525cM16035c8;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    interfaceC6571aM20324a = c14525cM16033a2;
                    return interfaceC6571aM20324a.getRoot();
                }
                interfaceC6571aM20324a = c14525cM16035c;
                interfaceC6571aM20324a = c14525cM16035c2;
                interfaceC6571aM20324a = c14525cM16035c3;
                interfaceC6571aM20324a = c14525cM16035c4;
                interfaceC6571aM20324a = c14525cM16035c5;
                interfaceC6571aM20324a = c14525cM16035c6;
                interfaceC6571aM20324a = c14525cM16035c7;
                interfaceC6571aM20324a = c14525cM16035c8;
                interfaceC6571aM20324a = c14525cM16033a2;
                interfaceC6571aM20324a = c14525cM16033a2;
                return null;
        }
    }
}
