package p1140z1;

import androidx.compose.p650ui.node.Owner;
import androidx.compose.p650ui.platform.AndroidComposeView;
import p492U1.C7538c;
import p523V9.AbstractC8111i5;
import p571X9.AbstractC9394x4;

/* JADX INFO: renamed from: z1.G */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21661G {

    /* JADX INFO: renamed from: a */
    public static final C7538c f68676a = AbstractC9394x4.m9976a();

    /* JADX INFO: renamed from: a */
    public static final Owner m22082a(C21658D c21658d) {
        AndroidComposeView androidComposeView = c21658d.f68658u0;
        if (androidComposeView != null) {
            return androidComposeView;
        }
        AbstractC8111i5.m8593d("LayoutNode should be attached to an owner");
        throw null;
    }
}
