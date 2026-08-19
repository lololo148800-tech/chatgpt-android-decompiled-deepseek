package p342Nj;

import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPositionKt;
import com.withpersona.sdk2.inquiry.network.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import lk.C17062e;
import mm.C17309l;
import p025An.C0644w;
import p1044uj.C20362t;
import p1044uj.C20365u0;
import p1044uj.C20370z;
import p1156zj.EnumC22128V0;
import p247Jj.AbstractC4385H;
import p247Jj.AbstractC4433h0;
import p247Jj.C4412V;
import p247Jj.C4417Z;
import p247Jj.C4425d0;
import p247Jj.C4431g0;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p909nm.C17690x;
import p994rk.AbstractC19213r2;

/* JADX INFO: renamed from: Nj.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5807a {
    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap m6191b(String str, Map map, List list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object next;
        String text;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (AbstractC16544l.m18089b(((NextStep.GovernmentId.LocalizationOverride) obj).getPage(), str)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C17309l c17309l = (C17309l) entry.getKey();
            String str2 = (String) entry.getValue();
            EnumC22128V0 enumC22128V0 = (EnumC22128V0) c17309l.f55136Y;
            String str3 = (String) c17309l.f55137Z;
            if (arrayList != null) {
                arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    NextStep.GovernmentId.LocalizationOverride localizationOverride = (NextStep.GovernmentId.LocalizationOverride) obj2;
                    if (AbstractC16544l.m18089b(localizationOverride.getSide(), enumC22128V0.f69952Y) || localizationOverride.getSide() == null) {
                        if (AbstractC16544l.m18089b(localizationOverride.getKey(), str3)) {
                            arrayList2.add(obj2);
                        }
                    }
                }
            } else {
                arrayList2 = null;
            }
            String str4 = enumC22128V0.f69952Y;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((NextStep.GovernmentId.LocalizationOverride) next).getIdClass() != null);
                NextStep.GovernmentId.LocalizationOverride localizationOverride2 = (NextStep.GovernmentId.LocalizationOverride) next;
                if (localizationOverride2 != null && (text = localizationOverride2.getText()) != null) {
                    str2 = text;
                }
            }
            linkedHashMap.put(str4, str2);
            if (arrayList2 != null) {
                ArrayList<NextStep.GovernmentId.LocalizationOverride> arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (((NextStep.GovernmentId.LocalizationOverride) obj3).getIdClass() != null) {
                        arrayList3.add(obj3);
                    }
                }
                for (NextStep.GovernmentId.LocalizationOverride localizationOverride3 : arrayList3) {
                    String str5 = enumC22128V0.f69952Y + "-" + localizationOverride3.getIdClass();
                    if (linkedHashMap.get(str5) == null) {
                        linkedHashMap.put(str5, localizationOverride3.getText());
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: c */
    public static final C4417Z m6192c(NextStep.Document document, String sessionToken, String inquiryId) {
        C20370z c20370z;
        C20365u0 c20365u0;
        NextStep.Document.Pages.DocumentPages document2;
        NextStep.Document.Pages.UploadOptionsDialog uploadOptionsDialog;
        NextStep.Document.Pages.DocumentPages document3;
        NextStep.Document.Pages.DocumentStartPage prompt;
        AbstractC16544l.m18094g(document, "<this>");
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        String name = document.getName();
        String name2 = document.getName();
        StepStyles.DocumentStepStyle styles = document.getStyles();
        NextStep.CancelDialog cancelDialog = document.getConfig().getLocalizations().getCancelDialog();
        NextStep.Document.Pages pages = document.getConfig().getPages();
        NextStep.Document.Localizations localizations = document.getConfig().getLocalizations();
        AbstractC16544l.m18094g(localizations, "localizations");
        if (pages == null || (document3 = pages.getDocument()) == null || (prompt = document3.getPrompt()) == null) {
            String title = localizations.getPromptPage().getTitle();
            String prompt2 = localizations.getPromptPage().getPrompt();
            String btnUpload = localizations.getPromptPage().getBtnUpload();
            String btnCapture = localizations.getPromptPage().getBtnCapture();
            c20370z = new C20370z(AbstractC19213r2.m20321d(AbstractC17681o.m19382k(new UiComponentConfig.Title(UiComponentConfig.Title.type, new UiComponentConfig.Title.Attributes(title == null ? "" : title, null, null, 6, null), null, 4, null), new UiComponentConfig.Text("body", new UiComponentConfig.Text.Attributes(prompt2 == null ? "" : prompt2, null, null, 6, null), null, 4, null), new UiComponentConfig.LocalImage("hero_image", new UiComponentConfig.LocalImage.Attributes(UiComponentConfig.LocalImage.Image.DOCUMENT_START_HERO, null), null, 4, null), new UiComponentConfig.CombinedStepButton("camera_button", new BasicButtonAttributes(btnCapture == null ? "" : btnCapture, UiComponentConfig.Button.ButtonType.PRIMARY, null, null, 12, null), null, 4, null), new UiComponentConfig.CombinedStepButton("upload_button", new BasicButtonAttributes(btnUpload == null ? "" : btnUpload, UiComponentConfig.Button.ButtonType.SECONDARY, null, null, 12, null), null, 4, null))), null, "upload_button", null, "camera_button", null);
        } else {
            List<UiComponentConfig> components = prompt.getUiStep().getConfig().getComponents();
            ArrayList arrayListM20321d = components != null ? AbstractC19213r2.m20321d(components) : null;
            StepStyles.UiStepStyle styles2 = prompt.getUiStep().getStyles();
            NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping = prompt.getComponentNameMapping();
            String buttonPhotoLibrary = componentNameMapping != null ? componentNameMapping.getButtonPhotoLibrary() : null;
            NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping2 = prompt.getComponentNameMapping();
            String buttonFilePicker = componentNameMapping2 != null ? componentNameMapping2.getButtonFilePicker() : null;
            NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping3 = prompt.getComponentNameMapping();
            String buttonCamera = componentNameMapping3 != null ? componentNameMapping3.getButtonCamera() : null;
            NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping4 = prompt.getComponentNameMapping();
            c20370z = new C20370z(arrayListM20321d, styles2, buttonFilePicker, buttonPhotoLibrary, buttonCamera, componentNameMapping4 != null ? componentNameMapping4.getButtonUploadOptions() : null);
        }
        if (pages == null || (document2 = pages.getDocument()) == null || (uploadOptionsDialog = document2.getUploadOptionsDialog()) == null) {
            String captureOptionsDialogTitle = localizations.getPromptPage().getCaptureOptionsDialogTitle();
            String btnCapture2 = localizations.getPromptPage().getBtnCapture();
            String btnUpload2 = localizations.getPromptPage().getBtnUpload();
            c20365u0 = new C20365u0(AbstractC19213r2.m20321d(AbstractC17681o.m19382k(new UiComponentConfig.Title(UiComponentConfig.Title.type, new UiComponentConfig.Title.Attributes(captureOptionsDialogTitle == null ? "" : captureOptionsDialogTitle, null, null, 6, null), null, 4, null), new UiComponentConfig.CombinedStepButton("take_photo", new BasicButtonAttributes(btnCapture2 == null ? "" : btnCapture2, UiComponentConfig.Button.ButtonType.PRIMARY, null, null, 12, null), null, 4, null), new UiComponentConfig.CombinedStepButton("select_file", new BasicButtonAttributes(btnUpload2 == null ? "" : btnUpload2, UiComponentConfig.Button.ButtonType.SECONDARY, null, null, 12, null), null, 4, null))), null, "select_file", null, "take_photo", null);
        } else {
            List<UiComponentConfig> components2 = uploadOptionsDialog.getUiStep().getConfig().getComponents();
            ArrayList arrayListM20321d2 = components2 != null ? AbstractC19213r2.m20321d(components2) : null;
            StepStyles.UiStepStyle styles3 = uploadOptionsDialog.getUiStep().getStyles();
            NextStep.Document.Pages.UploadOptionsDialog.ComponentNameMapping componentNameMapping5 = uploadOptionsDialog.getComponentNameMapping();
            String buttonPhotoLibrary2 = componentNameMapping5 != null ? componentNameMapping5.getButtonPhotoLibrary() : null;
            NextStep.Document.Pages.UploadOptionsDialog.ComponentNameMapping componentNameMapping6 = uploadOptionsDialog.getComponentNameMapping();
            String buttonFilePicker2 = componentNameMapping6 != null ? componentNameMapping6.getButtonFilePicker() : null;
            NextStep.Document.Pages.UploadOptionsDialog.ComponentNameMapping componentNameMapping7 = uploadOptionsDialog.getComponentNameMapping();
            String buttonCamera2 = componentNameMapping7 != null ? componentNameMapping7.getButtonCamera() : null;
            NextStep.Document.Pages.UploadOptionsDialog.ComponentNameMapping componentNameMapping8 = uploadOptionsDialog.getComponentNameMapping();
            c20365u0 = new C20365u0(arrayListM20321d2, styles3, buttonFilePicker2, buttonPhotoLibrary2, buttonCamera2, componentNameMapping8 != null ? componentNameMapping8.getButtonCancel() : null);
        }
        return new C4417Z(inquiryId, sessionToken, null, styles, cancelDialog, document, name, new C20362t(c20370z, c20365u0), document.getConfig().getAssets(), name2);
    }

    /* JADX WARN: Failed to calculate best type for var: r10v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$Config
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: java.lang.Boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r29v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r33v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r33v0 ??, new type: java.lang.Boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r33v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r33v0 ??, new type: java.lang.Boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r33v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r33v1 ??, new type: java.lang.Boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r33v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r33v1 ??, new type: java.lang.Boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r33v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r33v4 ??, new type: java.lang.Boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r38v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r38v0 ??, new type: com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v5 ??, new type: com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$Config
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v5 ??, new type: com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$Config
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v6 ??, new type: com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AutoClassificationConfig
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v6 ??, new type: com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AutoClassificationConfig
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v3 ??, new type: java.lang.Boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r38v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r38v0 ??, new type: com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v1 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: d */
    public static final p247Jj.C4421b0 m6193d(com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId r38, java.lang.String r39, java.lang.String r40, java.lang.String r41) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p342Nj.AbstractC5807a.m6193d(com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId, java.lang.String, java.lang.String, java.lang.String):Jj.b0");
    }

    /* JADX INFO: renamed from: e */
    public static final C4425d0 m6194e(NextStep.Selfie selfie, String sessionToken, String inquiryId) {
        AbstractC16544l.m18094g(selfie, "<this>");
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        NextStep.Selfie.CaptureMethod selfieType = selfie.getConfig().getSelfieType();
        String name = selfie.getName();
        String name2 = selfie.getName();
        Boolean backStepEnabled = selfie.getConfig().getBackStepEnabled();
        boolean zBooleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = selfie.getConfig().getCancelButtonEnabled();
        boolean zBooleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        String fieldKeySelfie = selfie.getConfig().getFieldKeySelfie();
        boolean requireStrictSelfieCapture = selfie.getConfig().getRequireStrictSelfieCapture();
        Boolean skipPromptPage = selfie.getConfig().getSkipPromptPage();
        boolean zBooleanValue3 = skipPromptPage != null ? skipPromptPage.booleanValue() : false;
        NextStep.Selfie.Localizations localizations = selfie.getConfig().getLocalizations();
        StepStyles.SelfieStepStyle styles = selfie.getStyles();
        NextStep.CancelDialog cancelDialog = selfie.getConfig().getLocalizations().getCancelDialog();
        List<NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes = selfie.getConfig().getEnabledCaptureFileTypes();
        C17689w c17689w = C17689w.f56480Y;
        List<NextStep.Selfie.CaptureFileType> list = enabledCaptureFileTypes == null ? c17689w : enabledCaptureFileTypes;
        List<NextStep.Selfie.VideoCaptureMethod> videoCaptureMethods = selfie.getConfig().getVideoCaptureMethods();
        List<NextStep.Selfie.VideoCaptureMethod> list2 = videoCaptureMethods == null ? c17689w : videoCaptureMethods;
        NextStep.Selfie.AssetConfig assets = selfie.getConfig().getAssets();
        String videoSessionJwt = selfie.getConfig().getVideoSessionJwt();
        List<NextStep.Selfie.SelfiePose> orderedPoses = selfie.getConfig().getOrderedPoses();
        PendingPageTextPosition pendingPageTextVerticalPosition = selfie.getConfig().getPendingPageTextVerticalPosition();
        if (pendingPageTextVerticalPosition == null) {
            pendingPageTextVerticalPosition = PendingPageTextPositionKt.getDEFAULT_PROCESSING_TEXT_POSITION();
        }
        PendingPageTextPosition pendingPageTextPosition = pendingPageTextVerticalPosition;
        Boolean audioEnabled = selfie.getConfig().getAudioEnabled();
        return new C4425d0(inquiryId, sessionToken, null, styles, cancelDialog, selfieType, name, name2, zBooleanValue, zBooleanValue2, fieldKeySelfie, requireStrictSelfieCapture, zBooleanValue3, localizations, list, list2, assets, videoSessionJwt, orderedPoses, pendingPageTextPosition, audioEnabled != null ? audioEnabled.booleanValue() : true);
    }

    /* JADX INFO: renamed from: f */
    public static final C4431g0 m6195f(NextStep.C12890Ui c12890Ui, String sessionToken, String inquiryId, String str, Map map, C17062e inquirySessionConfig) {
        AbstractC16544l.m18094g(c12890Ui, "<this>");
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(inquirySessionConfig, "inquirySessionConfig");
        String name = c12890Ui.getName();
        List<UiComponentConfig> components = c12890Ui.getConfig().getComponents();
        if (components == null) {
            components = C17689w.f56480Y;
        }
        List<UiComponentConfig> list = components;
        Boolean backStepEnabled = c12890Ui.getConfig().getBackStepEnabled();
        boolean zBooleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = c12890Ui.getConfig().getCancelButtonEnabled();
        boolean zBooleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        Boolean terminal = c12890Ui.getConfig().getTerminal();
        boolean zBooleanValue3 = terminal != null ? terminal.booleanValue() : false;
        Map map2 = map == null ? C17690x.f56481Y : map;
        StepStyles.UiStepStyle styles = c12890Ui.getStyles();
        String string = UUID.randomUUID().toString();
        NextStep.C12890Ui.Localizations localizations = c12890Ui.getConfig().getLocalizations();
        NextStep.CancelDialog cancelDialog = localizations != null ? localizations.getCancelDialog() : null;
        NextStep.C12890Ui.Localizations localizations2 = c12890Ui.getConfig().getLocalizations();
        List<UiComponentError> serverComponentErrors = c12890Ui.getConfig().getServerComponentErrors();
        AbstractC16544l.m18091d(string);
        return new C4431g0(inquiryId, sessionToken, null, styles, cancelDialog, localizations2, str, name, list, zBooleanValue, zBooleanValue2, zBooleanValue3, map2, string, serverComponentErrors, inquirySessionConfig);
    }

    /* JADX INFO: renamed from: g */
    public static final AbstractC4433h0 m6196g(CheckInquiryResponse checkInquiryResponse, String str, C17062e inquirySessionConfig) {
        AbstractC16544l.m18094g(checkInquiryResponse, "<this>");
        AbstractC16544l.m18094g(inquirySessionConfig, "inquirySessionConfig");
        String inquiryId = checkInquiryResponse.getData().getId();
        NextStep nextStep = checkInquiryResponse.getData().getAttributes().getNextStep();
        if (nextStep instanceof NextStep.C12890Ui) {
            return m6195f((NextStep.C12890Ui) nextStep, str, inquiryId, checkInquiryResponse.getData().getAttributes().getStatus(), checkInquiryResponse.getData().getAttributes().getFields(), inquirySessionConfig);
        }
        if (nextStep instanceof NextStep.GovernmentId) {
            return m6193d((NextStep.GovernmentId) nextStep, str, inquiryId, checkInquiryResponse.getData().getAttributes().getSelectedCountryCode());
        }
        if (nextStep instanceof NextStep.Selfie) {
            return m6194e((NextStep.Selfie) nextStep, str, inquiryId);
        }
        if (nextStep instanceof NextStep.Document) {
            return m6192c((NextStep.Document) nextStep, str, inquiryId);
        }
        if (!(nextStep instanceof NextStep.Complete)) {
            if (AbstractC16544l.m18089b(nextStep, NextStep.Unknown.INSTANCE)) {
                throw new IllegalArgumentException(AbstractC9306j0.m9889h("Unknown type for step ", nextStep.getName()));
            }
            throw new C0644w();
        }
        String status = checkInquiryResponse.getData().getAttributes().getStatus();
        Map<String, AbstractC4385H> fields = checkInquiryResponse.getData().getAttributes().getFields();
        AbstractC16544l.m18094g((NextStep.Complete) nextStep, "<this>");
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        if (fields == null) {
            fields = C17690x.f56481Y;
        }
        return new C4412V(inquiryId, str, null, status, fields);
    }

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap m6190a(String str, String str2, String str3, List list) {
        if (str == null) {
            str = VjclRfeKsMflo.nlGLQnH;
        }
        return m6191b(str3, AbstractC17659D.m19244f(new C17309l(new C17309l(EnumC22128V0.Front, str2), str), new C17309l(new C17309l(EnumC22128V0.Back, str2), str), new C17309l(new C17309l(EnumC22128V0.BarcodePdf417, str2), str), new C17309l(new C17309l(EnumC22128V0.PassportSignature, str2), str), new C17309l(new C17309l(EnumC22128V0.FrontOrBack, str2), str)), list);
    }
}
