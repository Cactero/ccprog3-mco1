package manageHotel;

import main.AbstractView;
import shared.TemplateButton;
import shared.TemplateHeaderLabel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

/**
 *
 */
public class ManageHotelView extends AbstractView {

    private JPanel contentHolder;
    private Image bgImage;

    private JPanel headerHolder;
    private JLabel headerLabel;
    private ImageIcon headerImage;

    private JPanel optionsHolder;
    private JButton changeHotelName;
    private JButton addRooms;
    private JButton removeRooms;
    private JButton updateBasePrice;
    private JButton removeReservation;
    private JButton removeHotel;
    private JButton changeRoomType;

    private JPanel buttonsHolder;
    private JButton mainMenuButton;

    public ManageHotelView(){
        super("/assets/MANAGE_HOTEL_NAME.png");

        optionsHolder = new JPanel();
        optionsHolder.setOpaque(false);
        changeHotelName = new TemplateButton("Change Hotel Name");
        addRooms = new TemplateButton("Add Rooms");
        removeRooms = new TemplateButton("Remove Rooms");
        updateBasePrice = new TemplateButton("Update Base Price");
        removeReservation = new TemplateButton("Remove Reservation");
        removeHotel = new TemplateButton("Remove Hotel");
        changeRoomType = new TemplateButton("Change Room Type");
        optionsHolder.add(changeHotelName);
        optionsHolder.add(addRooms);
        optionsHolder.add(removeRooms);
        optionsHolder.add(updateBasePrice);
        optionsHolder.add(removeReservation);
        optionsHolder.add(removeHotel);
        optionsHolder.add(changeRoomType);
        contentHolder.add(optionsHolder);


        // cancel room creation and create room buttons
        buttonsHolder = new JPanel();
        buttonsHolder.setOpaque(false);
        mainMenuButton = new TemplateButton("Cancel");
        buttonsHolder.add(mainMenuButton);
        contentHolder.add(buttonsHolder, BorderLayout.SOUTH);


    }

    public void addAddRoomsButtonListener(ActionListener listener) { addRooms.addActionListener(listener); }
    public void addRemoveRoomsButtonListener(ActionListener listener) { removeRooms.addActionListener(listener); }
    public void addChangeHotelNameButtonListener(ActionListener listener) { changeHotelName.addActionListener(listener); }
    public void addUpdateBasePriceButtonListener(ActionListener listener) { updateBasePrice.addActionListener(listener); }
    public void addRemoveReservationButtonListener(ActionListener listener) { removeReservation.addActionListener(listener); }
    public void addRemoveHotelButtonListener(ActionListener listener) { removeReservation.addActionListener(listener); }
    public void addChangeRoomTypeButtonListener(ActionListener listener) { changeRoomType.addActionListener(listener); }
    public void addMainMenuButtonListener(ActionListener listener) { mainMenuButton.addActionListener(listener); }
}
