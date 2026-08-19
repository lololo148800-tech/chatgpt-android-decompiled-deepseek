package androidx.compose.p650ui.node;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p003A1.InterfaceC0161D1;
import p003A1.InterfaceC0172H0;
import p003A1.InterfaceC0182K1;
import p003A1.InterfaceC0250g;
import p003A1.InterfaceC0300w1;
import p003A1.InterfaceC0303x1;
import p1014t1.InterfaceC19735l;
import p1095x1.AbstractC21068W;
import p1117y1.C21364d;
import p1140z1.C21658D;
import p1140z1.C21660F;
import p1140z1.C21691f0;
import p328N1.InterfaceC5597m;
import p328N1.InterfaceC5598n;
import p350O1.C6046D;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p654b1.C11215i;
import p654b1.InterfaceC11209c;
import p693d1.InterfaceC12990c;
import p737f1.InterfaceC13515g;
import p774h1.InterfaceC14324B;
import p937p1.InterfaceC18285a;
import p954q1.InterfaceC18607b;
import p972qm.InterfaceC18776i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18067d2 = {"Landroidx/compose/ui/node/Owner;", "", "z1/D", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public interface Owner {
    InterfaceC0250g getAccessibilityManager();

    InterfaceC11209c getAutofill();

    C11215i getAutofillTree();

    InterfaceC0172H0 getClipboardManager();

    InterfaceC18776i getCoroutineContext();

    InterfaceC7537b getDensity();

    InterfaceC12990c getDragAndDropManager();

    InterfaceC13515g getFocusOwner();

    InterfaceC5598n getFontFamilyResolver();

    InterfaceC5597m getFontLoader();

    InterfaceC14324B getGraphicsContext();

    InterfaceC18285a getHapticFeedBack();

    InterfaceC18607b getInputModeManager();

    EnumC7546k getLayoutDirection();

    C21364d getModifierLocalManager();

    AbstractC21068W getPlacementScope();

    InterfaceC19735l getPointerIconService();

    C21658D getRoot();

    C21660F getSharedDrawScope();

    boolean getShowLayoutBounds();

    C21691f0 getSnapshotObserver();

    InterfaceC0300w1 getSoftwareKeyboardController();

    C6046D getTextInputService();

    InterfaceC0303x1 getTextToolbar();

    InterfaceC0161D1 getViewConfiguration();

    InterfaceC0182K1 getWindowInfo();

    void setShowLayoutBounds(boolean z6);
}
